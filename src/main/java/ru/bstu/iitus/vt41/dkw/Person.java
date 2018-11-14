package ru.bstu.iitus.vt41.dkw;

import java.util.Scanner;

public abstract class Person {
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public abstract void init(Scanner scanner);

    @Override
    public  String toString()
    {
        return  " Name: " + getName() + " Age: " + getAge();
    }
}