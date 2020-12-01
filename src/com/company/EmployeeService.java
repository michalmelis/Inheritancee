package com.company;
import model.Job;
import java.util.List;
public interface EmployeeService {
    float countallSalary(List<Job>typesOfJob);
    int   countallBonus(List<Job>typesOfJob);
}
