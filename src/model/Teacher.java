package model;

import model.Job;
import model.Jobs;

public class Teacher extends Job {
    public Teacher(float salary,int bonus){
        super(salary,bonus, Jobs.TEACHER);
    }


}



