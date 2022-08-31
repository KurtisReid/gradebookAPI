package dev.reid.services;

import dev.reid.entities.Student;

public interface StudentService {

    Student addStudent(Student student);

    Student getStudentByName(String firstName);

    Boolean deleteStudent(int id);
}
