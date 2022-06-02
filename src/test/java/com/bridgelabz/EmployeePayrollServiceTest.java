package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EmployeePayrollServiceTest {
    EmployeePayrollFileIOService employeePayrollFileIOService=new EmployeePayrollFileIOService();
    @Test
    public void CheckFileCreatedOrNot(){
        Assertions.assertTrue(employeePayrollFileIOService.CreateFile());
    }
    @Test
    public void CheckFileIsExistOrNot(){
        Assertions.assertTrue(employeePayrollFileIOService.CheckExistOrNot());
    }
    @Test
    public void CheckFileDeletedOrNot(){
        Assertions.assertTrue(employeePayrollFileIOService.DeleteFileOperation());
    }
    @Test
    public void DisplayFilesFromDirectory(){
        Assertions.assertTrue(employeePayrollFileIOService.ListOfAllFilesAndDirectory());
    }
    @Test
    public void GivenSqlQuery_RetriveAllDataFromTable_ShouldReturnTrue() {
        JDBC_Operations jdbc_operations = new JDBC_Operations();
        List<EmployeeData> employeeData = jdbc_operations.ReadAllDataFromTables();
        for (EmployeeData employeeData1 : employeeData) {
            System.out.println(employeeData1);
        }
        Assertions.assertEquals(7, employeeData.size());
    }
    @Test
    public void GivenSqlQuery_RecordUpdatedProper_ShouldReturnTrue() {
        JDBC_Operations jdbc_operations = new JDBC_Operations();
        Assertions.assertTrue(jdbc_operations.UpdateRecord());
    }
}
