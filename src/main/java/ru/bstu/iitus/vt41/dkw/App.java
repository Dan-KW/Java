package ru.bstu.iitus.vt41.dkw;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       start();
    }

    public  static  void  start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of people to add:");
        Person[] person = new Person[scanner.nextInt()];

        for (int i = 0; i < person.length; i++) {
            System.out.println("Select the type of person to create");
            System.out.println("1: Student");
            System.out.println("2: Pupil");
            System.out.println("3: Lecturer");
            System.out.println("4: Director");

            int x = scanner.nextInt();
            boolean bool = true;
            do {
                try {
                    person[i] = createPerson(x);
                    person[i].init(scanner);
                    bool = false;
                } catch (InputMismatchException ex) {
                    System.err.printf("\nException: %s\n", ex);
                    scanner.nextLine();
                    System.out.println("You must enter correctly");
                }
            }while (bool);

        }

        System.out.println("Person with the minimum age\n" + sMinAge(person));
    }
    public static Person createPerson(int x) {
        Person person = null;

        switch (x) {
            case 1:
                person = new Student();
                break;
            case 2:
                person = new Pupil();
                break;
            case 3:
                person = new Lecturer();
                break;
            case 4:
                person = new Director();
        }

        return person;

    }

    public static Person sMinAge(Person[] person) {
        int minAge = person[0].getAge();
        int index = 0;

        for (int i = 0; i< person.length; i++) {
            if (person[i].getAge() < minAge) {
                minAge = person[i].getAge();
                index = i;
            }
        }

        return person[index];
    }
}
