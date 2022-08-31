package dev.reid.gradebook;

import dev.reid.entities.Student;
import dev.reid.repos.StudentRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentRepoTests {

    @Autowired
    StudentRepo studentRepo;
    @Test
    public void create_student()
    {
        Student student = new Student(0,"kh", "rg", "GU");
        Student savedStudent = this.studentRepo.save(student);
        Assertions.assertEquals(1, savedStudent.getId());
        System.out.println(savedStudent);
    }


}
