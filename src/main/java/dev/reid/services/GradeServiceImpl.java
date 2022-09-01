package dev.reid.services;

import dev.reid.entities.Grade;
import dev.reid.repos.GradeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class GradeServiceImpl implements GradeService{

    @Autowired
    GradeRepo gradeRepo;

    @Override
    public Grade createGrade(Grade grade) {
        return this.gradeRepo.save(grade);
    }

    @Override
    public List<Grade> getGradesById(Grade grade, int id) {

        return this.gradeRepo.findAllById(Collections.singleton(id));
    }

    @Override
    public boolean deleteGradeById(int id) {

        this.gradeRepo.deleteById(id);

        return true;
    }
}
