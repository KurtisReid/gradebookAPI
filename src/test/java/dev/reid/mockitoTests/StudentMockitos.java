package dev.reid.mockitoTests;


import dev.reid.entities.Student;
import dev.reid.services.StudentServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentMockitos {

    @Autowired
    StudentServiceImpl studentServiceImpl;

    @Test
    void add_student_to_list(){
    StudentServiceImpl studentService = Mockito.mock(StudentServiceImpl.class);
    Student student = new Student(0, "Billy", "Idol", "Elizabeth Idol");

    Mockito.when(studentService.addStudent(student)).thenReturn(student);
    Assertions.assertThrows(RuntimeException.class, ()->{
        studentService.addStudent(student);
    });
    }

//    @Test
//    void get_all_students(){
//
//    }
//
//    @Test
//    void get_student_by_id(){
//    }
//
//    @Test
//    void get_student_by_name(){
//    }
//
//    @Test
//    void delete_student_by_id(){
//    }


}
