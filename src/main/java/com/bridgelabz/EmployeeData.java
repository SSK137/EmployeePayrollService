package com.bridgelabz;

public class EmployeeData {
    public int id;
    public String name;
    public double salary;

    public EmployeeData(int id,String  name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public String toString(){
        return "Employee Payroll Data]      Id :"+id+" Name :"+name+" Salary : "+salary;
    }
}