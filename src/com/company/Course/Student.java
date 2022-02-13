package com.company.Course;

import java.time.LocalDate;

public class Student {
    String nameSrnameStudent;
    int age;

    public Student(){}

    public Student(LocalDate birthDate, String nameSrnameStudent) {
        this.nameSrnameStudent = nameSrnameStudent;
        this.age = (int)(LocalDate.now().getYear() - birthDate.getYear());
    }

    public String getNameSrnameStudent() {
        return nameSrnameStudent;
    }

    public void setNameSrnameStudent(String nameSrnameStudent) {
        this.nameSrnameStudent = nameSrnameStudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0)
        this.age = age;
        else
            System.out.println("error"+ age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSrnameStudent='" + nameSrnameStudent + '\'' +
                ", age=" + age +
                '}';
    }
}
