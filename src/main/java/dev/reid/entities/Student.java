package dev.reid.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "guardian_username")
    private String guardianUsername;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "s_Id")
    @JsonManagedReference
    private Set<Grade> grades;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String guardianUsername) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.guardianUsername = guardianUsername;
    }

    public Student(int id, String firstName, String lastName, String guardianUsername, Set<Grade> grades) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.guardianUsername = guardianUsername;
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGuardianUsername() {
        return guardianUsername;
    }

    public void setGuardianUsername(String guardianUsername) {
        this.guardianUsername = guardianUsername;
    }

    public Set<Grade> getGrades() {
        return grades;
    }

    public void setGrades(Set<Grade> grades) {
        this.grades = grades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", guardianUsername='" + guardianUsername + '\'' +
                '}';
    }
}
