package dev.reid.services;

import dev.reid.entities.Grade;

import java.util.List;

public interface GradeService {

    Grade createGrade(Grade grade);

    List<Grade> getGradesById(Grade grade, int id);

    boolean deleteGradeById(int id);


}
