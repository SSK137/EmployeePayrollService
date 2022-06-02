package com.bridgelabz;

public class EmployeeData {
    public int id;
    public String name;
    public double salary;
    public String Start_Date;
    public String Gender;

    public EmployeeData(int id,String  name,double salary,String Start_Date,String Gender){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.Start_Date=Start_Date;
        this.Gender=Gender;
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
        return "Employee Payroll Data]      Id :"+id+" Name :"+name+" Salary : "+salary+" Start_Date :"+Start_Date+" Gender :"+Gender;
    }
}