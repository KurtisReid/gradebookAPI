package dev.reid.repos;

import dev.reid.entities.Grade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GradeRepo extends JpaRepository<Grade, Integer> {

    List<Grade> getByStudentID(int sId);
}
