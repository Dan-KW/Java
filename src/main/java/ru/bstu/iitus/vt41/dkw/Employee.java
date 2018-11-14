package ru.bstu.iitus.vt41.dkw;

public abstract class Employee extends Person {
    private int workExperience;

    public void setWorkExperience(int Exp)
    {
        this.workExperience = Exp;
    }
    public  int getWorkExperience()
    {
        return workExperience;
    }
}
