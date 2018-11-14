package ru.bstu.iitus.vt41.dkw;

import ru.bstu.iitus.vt41.dkw.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lecturer extends Employee {
    private String subject;

    public Lecturer(){

    }
    @Override
    public void init(Scanner scanner) throws InputMismatchException {
        System.out.println("Enter Lecturer Name: ");
        super.setName(scanner.next());
        System.out.println("Enter Lecturer Age");
        super.setAge(scanner.nextInt());
        System.out.println("Enter Lecturer Experience: ");
        super.setWorkExperience(scanner.nextInt());
        System.out.println("Enter Lecturer's Subject area: ");
        subject = scanner.next();
    }

    public String getSubject()
    {
        return subject;
    }

    @Override
    public  String toString() {
        return  super.toString() + " Subject: " + this.getSubject() + " Experience " + super.getWorkExperience();
    }

}
