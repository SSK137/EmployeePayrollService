package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    static Scanner scanner=new Scanner(System.in);
    static List<EmployeeData> EmployeeDataList;
    /*Declared Constructor To Initialize Class Object*/
    public EmployeePayrollService(ArrayList<EmployeeData> EmployeeDataList) {
        this.EmployeeDataList=EmployeeDataList;
    }
    /*---Method To Read Employee Payroll Data---*/
    public void ReadEmployeePayrollData(Scanner scanner){
        System.out.println("Enter Employee Id : ");
        int id=scanner.nextInt();
        System.out.println("Enter Name Of Employee : ");
        String name=scanner.next();
        System.out.println("Enter Salary : ");
        double salary=scanner.nextDouble();
        EmployeeDataList.add(new EmployeeData(id,name,salary));
    }
    /*---Method To Write Data To the Console---*/
    public void WriteEmployeePayrollData(){
        System.out.println(EmployeeDataList);
    }
    public static void main(String[] args) {
        //Created ArrayList To Store Employee Data
        ArrayList<EmployeeData> employeeDataArrayList=new ArrayList<>();
        //Created Class Object to Function Call
        EmployeePayrollService employeePayrollService=new EmployeePayrollService(employeeDataArrayList);
        //Function Calling
        employeePayrollService.ReadEmployeePayrollData(scanner);
        employeePayrollService.WriteEmployeePayrollData();
    }
}
