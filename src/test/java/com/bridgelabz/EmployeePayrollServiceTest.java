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
}
