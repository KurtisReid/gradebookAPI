package dev.reid.services;

import dev.reid.entities.Grade;

import java.util.List;

public interface GradeService {

    Grade createGrade(Grade grade);

    List<Grade> getGradesByStudentId(int id);

    boolean deleteGradeById(int id);


}
