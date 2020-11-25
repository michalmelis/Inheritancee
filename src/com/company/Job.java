package com.company;

public class Job {
    private float salary;
    private int bonus;
    Jobs workers;

    public Job(float salary,int bonus,Jobs workers){

        this.workers=workers;
        this.salary=salary;
        this.bonus=bonus;

    }

    public void getInfo() {
        System.out.println(workers.name + "'s salary is " + salary + " and bonus is " + bonus+ ".");
    }
}
