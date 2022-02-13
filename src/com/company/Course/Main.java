package com.company.Course;

import com.company.Course.Course;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

    Course cr = new Course("Java5", "0312 04 04 09", "Muhammed Allanov", LocalDate.of(2022, 01, 03));
        System.out.println(cr);

    Student st = new Student(LocalDate.of(1992, 11,10),"Akmaral Mazhitova");
        System.out.println(st);
    }
}
