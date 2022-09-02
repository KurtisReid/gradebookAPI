package dev.reid.services;

import dev.reid.entities.Student;
import dev.reid.exceptions.NoFirstNameException;
import dev.reid.exceptions.NoLastNameException;
import dev.reid.exceptions.NoStudentFoundException;
import dev.reid.repos.StudentRepo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    Logger logger = LogManager.getLogger(StudentServiceImpl.class);

    @Autowired
    StudentRepo studentRepo;

    @Override
    public Student addStudent(Student student) {
        if(student.getFirstName().length() >0){
            throw new NoFirstNameException("Must enter a first name");
        }
        if(student.getLastName() == null){
            throw new NoLastNameException("Must enter a last name");
        }
        return this.studentRepo.save(student);
    }

    @Override
    public Student getStudentById(int id) {
        Optional<Student> possibleStudent = this.studentRepo.findById(id);
        if(possibleStudent.isPresent()){
            return possibleStudent.get();
        }else{
            this.logger.error("A student could not be found with id " + id);
            throw new NoStudentFoundException("No student found");
        }
    }

    @Override
    public List<Student> getAllStudents() {
        return this.studentRepo.findAll();
    }

    @Override
    public List<Student> getStudentByName(String firstName) {
        return this.studentRepo.findStudentsByFirstName(firstName);
    }

    @Override
    public boolean deleteStudent(int id) {
        if(this.studentRepo.existsById(id)){
            this.studentRepo.deleteById(id);
            return true;
        }else {
            return false;
        }
    }
}
