package ru.bstu.iitus.vt41.dkw;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Director extends Employee {
    private int officeNumber;

    public Director() {
    }

    @Override
    public void init(Scanner scanner) throws InputMismatchException {
        System.out.println("Enter Name");
        super.setName(scanner.next());

        System.out.println("Enter age:");
        super.setAge(scanner.nextInt());

        System.out.println("Enter job experience:");
        super.setWorkExperience(scanner.nextInt());

        System.out.println("Enter Salary:");
        officeNumber=scanner.nextInt();
    }

    public int getOfficeNumber() {
        return officeNumber;
    }

    @Override
    public String toString() {
        return super.toString() + " Office Num: " + this.getOfficeNumber();
    }
}