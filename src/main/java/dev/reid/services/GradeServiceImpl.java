package dev.reid.services;

import dev.reid.entities.Grade;
import dev.reid.repos.GradeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        return null;
    }

    @Override
    public boolean deleteGradeById(int id) {
        return false;
    }
}
