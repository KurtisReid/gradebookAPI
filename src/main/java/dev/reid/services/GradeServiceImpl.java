package dev.reid.services;

import dev.reid.entities.Grade;

import dev.reid.entities.Student;

import dev.reid.exceptions.EmptyGradeException;
import dev.reid.exceptions.NoStudentFoundException;

import dev.reid.repos.GradeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class GradeServiceImpl implements GradeService{

    @Autowired
    GradeRepo gradeRepo;

    @Override
    public Grade createGrade(Grade grade) {
        if (grade == null) {
            throw new EmptyGradeException("No Grade found");
        }
        return this.gradeRepo.save(grade);
    }

    @Override

    public List<Grade> getGradesByStudentId(int id) {
        //check for student id as a foreign key in grade repo
        if(!gradeRepo.existsById(id)){
            throw new NoStudentFoundException("No student with id "+ id);
        }
        return this.gradeRepo.getByStudentId(id);


    }

    @Override
    public boolean deleteGradeById(int id) {
        if(this.gradeRepo.existsById(id)){
            this.gradeRepo.deleteById(id);
            return true;
        }else {
            return false;
        }
    }
}
