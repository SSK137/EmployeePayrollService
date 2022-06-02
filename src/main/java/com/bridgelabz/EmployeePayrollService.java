package com.bridgelabz;

import java.io.*;
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
    public static void ReadEmployeePayrollData(EnumIOService enumIOService){
        if(enumIOService.equals(EnumIOService.File_IO)){
            EmployeePayrollService.readFromFile();
        }else {
            System.out.println("Enter Employee Id : ");
            int id = scanner.nextInt();
            System.out.println("Enter Name Of Employee : ");
            String name = scanner.next();
            System.out.println("Enter Salary : ");
            double salary = scanner.nextDouble();
            String Date=scanner.next();
            String gender=scanner.next();
            EmployeeDataList.add(new EmployeeData(id, name, salary,Date,gender));
            AddDataToFile(EmployeeDataList);
        }
    }
    public static List<String> readFromFile() {
        List<String> arrayList;
        try {
            File file = new File("//home//hp//IdeaProjects//EmployeePayrollService/src/test.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            arrayList = new ArrayList<>();
            String Data;
            int count = 0;
            while ((Data = bufferedReader.readLine()) != null) {
                count++;
                System.out.println(Data);
                arrayList.add(Data);
            }
            System.out.println(count);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        return arrayList;
    }
    public static void AddDataToFile(List<EmployeeData> employeeData){
        File file = new File("//home//hp//IdeaProjects//EmployeePayrollService//src//test.txt");
        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file,true))){
            bufferedWriter.write(String.valueOf(employeeData));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    /*---Method To Write Data To the Console---*/
    public void WriteEmployeePayrollData(EnumIOService enumIOService){
        if(enumIOService.equals(EnumIOService.File_IO))
        {
            EmployeePayrollService.readFromFile();
        }else {
            System.out.println(EmployeeDataList);
        }
    }
    public static void main(String[] args) {
        //Created ArrayList To Store Employee Data
        ArrayList<EmployeeData> employeeDataArrayList=new ArrayList<>();
        //Created Class Object to Function Call
        EmployeePayrollService employeePayrollService=new EmployeePayrollService(employeeDataArrayList);
        //Function Calling
        employeePayrollService.ReadEmployeePayrollData(EnumIOService.Consol_IO);
        employeePayrollService.WriteEmployeePayrollData(EnumIOService.File_IO);
        //employeePayrollService.ReadFile();
    }
}
