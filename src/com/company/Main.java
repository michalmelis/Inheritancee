package com.company;

import model.Driver;
import model.Job;
import model.Programmer;
import model.Teacher;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer(2500,500);
        Teacher teacher = new Teacher(1000,300);
        Driver driver = new Driver(500,200);
        List<Job> typesOfJob = Arrays.asList( driver,programmer,teacher);
        typesOfJob.forEach(i -> i.getInfo());
        EmployeeService employeeService = new EmployeeServiceImpl();
        System.out.println(employeeService.countallBonus(typesOfJob));
        System.out.println(employeeService.countallSalary(typesOfJob));

    }
}
