package com.company;

public class Main {

    public static void main(String[] args) {
        Programmer programmer = new Programmer(2500,500);
        Teacher teacher = new Teacher(1000,300);
        programmer.getInfo();
        teacher.getInfo();
    }
}
