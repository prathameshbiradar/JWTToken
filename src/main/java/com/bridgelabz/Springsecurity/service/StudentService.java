package com.bridgelabz.Springsecurity.service;

import com.bridgelabz.Springsecurity.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    List<Student> students = new ArrayList<>(Arrays.asList(
            new Student(1,"Akshay",90),
            new Student(2,"Nagesh",95),
            new Student(3,"Anand",96)
    ));

    public List<Student>getAllStudent()
    {
        return students;
    }
    public void addStudent(Student student)
    {
        students.add(student);
    }
}
