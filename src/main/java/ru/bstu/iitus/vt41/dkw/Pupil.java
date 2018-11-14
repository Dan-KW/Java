package ru.bstu.iitus.vt41.dkw;

import ru.bstu.iitus.vt41.dkw.Person;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Pupil extends Person {
    private int pupilNumber;
    private int pupilClass;

    public Pupil() { }
    @Override
    public void init(Scanner scanner) throws InputMismatchException {
        System.out.println("Enter Pupil's Name: ");
        super.setName(scanner.nextLine());
        System.out.println("Enter the Pupil's Age");
        super.setAge(scanner.nextInt());
        System.out.println("Enter the Pupil's Number");
        pupilNumber = scanner.nextInt();
        System.out.println("Enter the Pupil's Class");
        pupilClass = scanner.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + " Pupil class: " + this.pupilClass + " Pupil's Number: " + this.pupilNumber;
    }
}
