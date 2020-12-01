package com.company;
import model.Job;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public float countallSalary(List<Job>typesOfJob){
        return(float) typesOfJob.stream().mapToDouble(i -> i.getSalary()).sum();
}

    @Override
    public int countallBonus(List<Job> typesOfJob) {
        return typesOfJob.stream().mapToInt(i -> i.getBonus()).sum();
    }

}
