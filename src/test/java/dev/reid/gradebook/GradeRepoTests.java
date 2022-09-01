package dev.reid.gradebook;

import dev.reid.entities.Behavior;
import dev.reid.entities.Grade;
import dev.reid.repos.GradeRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class GradeRepoTests {
    @Autowired
    GradeRepo gradeRepo;
    @Test
    public void create_grade()
    {
        // hello
        Grade grade = new Grade(1,1,1010, "bad student", Behavior.EVIL);
        Grade savedGrade = this.gradeRepo.save(grade);
        Assertions.assertNotEquals(0, savedGrade.getgId());
    }

    @Test
    public void get_grades_by_sId(){
        Grade grade = new Grade(1,1,1010, "bad student", Behavior.EVIL);
        Grade savedGrade = this.gradeRepo.save(grade);
        List<Grade> grades = this.gradeRepo.getByStudentId(1);
        System.out.println(grades);
    }



}
