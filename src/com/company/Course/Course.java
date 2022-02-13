package com.company.Course;

import java.time.LocalDate;

public class Course {
    String name;
    String tel;
    String nameSrNameTeacher;
    LocalDate date;

public Course(){}

    public Course(String name, String tel, String nameSrNameTeacher, LocalDate date) {
        this.name = name;
        this.tel = tel;
        this.nameSrNameTeacher = nameSrNameTeacher;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getNameSrNameTeacher() {
        return nameSrNameTeacher;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", nameSrNameTeacher='" + nameSrNameTeacher + '\'' +
                ", date=" + date +
                '}';
    }
}
