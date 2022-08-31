package dev.reid.entities;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

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

    public Student() {
    }

    public Student(int id, String firstName, String lastName, String guardianUsername) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.guardianUsername = guardianUsername;
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
