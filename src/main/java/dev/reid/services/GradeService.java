package dev.reid.services;

import dev.reid.entities.Grade;
import dev.reid.entities.Student;

import java.util.List;

public interface GradeService {

    Grade createGrade(Grade grade);

    List<Grade> getGradesByStudentId(Student id);

    boolean deleteGradeById(int id);


}
