package dev.reid.gradebook;

import dev.reid.entities.Behavior;
import dev.reid.entities.Grade;
import dev.reid.repos.GradeRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GradeRepoTests {
    @Autowired
    GradeRepo gradeRepo;
    @Test
    public void create_grade()
    {
        Grade grade = new Grade(1,1,1010, "bad student", Behavior.EVIL);
        Grade savedGrade = this.gradeRepo.save(grade);
        Assertions.assertNotEquals(0, savedGrade.getgId());
    }


}
