package com.iba.courses.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Student")
public class Student {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "login")
    @NotNull
    private String login;

    @Column(name = "password")
    @NotNull
    private String password;

    @Column(name = "university")
    @NotNull
    private String university;

    @Column(name = "course")
    @NotNull
    private Integer course;

    public Student() {
    }

    public Student(@NotNull String name, @NotNull String login, @NotNull String password, @NotNull String university, @NotNull Integer course) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.university = university;
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", university='" + university + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
