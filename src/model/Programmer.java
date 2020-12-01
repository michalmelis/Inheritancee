package model;

import model.Job;
import model.Jobs;

public  class Programmer extends Job {

    public Programmer(float salary,int bonus) {

        super(salary,bonus, Jobs.PROGRAMMER);
    }

    @Override
    public void getInfo() {
        System.out.println(workers.name + "'s salary is " + (salary + bonus) +  ".");
    }
}
