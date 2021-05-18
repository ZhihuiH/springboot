package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Kyle", "Huang"));
        return list;
    }
}
