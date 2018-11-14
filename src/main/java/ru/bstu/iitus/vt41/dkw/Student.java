package ru.bstu.iitus.vt41.dkw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student extends Person {
    private int studentNumber;
    private String group;

    public Student()
    {

    }
    @Override
    public void init(Scanner scanner) throws InputMismatchException {
        System.out.println("Enter Student Name");
        super.setName(scanner.next());
        System.out.println("Enter Age");
        super.setAge(scanner.nextInt());
        System.out.println("Enter Student Number");
        studentNumber = scanner.nextInt();
        System.out.println("Enter Student Group Number");
        group = scanner.next();
    }
    public String getGroup()
    {
        return group;
    }
    public int getStudentNumber()
    {
        return studentNumber;
    }
    @Override
    public  String toString() {
        return  super.toString() + " Student Number: " + getStudentNumber() + " Group: " + getGroup();
    }
}
