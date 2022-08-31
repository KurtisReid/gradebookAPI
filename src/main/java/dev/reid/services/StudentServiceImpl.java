package dev.reid.services;

import dev.reid.entities.Student;
import dev.reid.repos.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepo studentRepo;

    @Override
    public Student addStudent(Student student) {
        return this.studentRepo.save(student);
    }

    @Override
    public Student getStudentByName(String firstName) {
    return null;
    }

    @Override
    public boolean deleteStudent(int id) {
        return false;
    }
}
