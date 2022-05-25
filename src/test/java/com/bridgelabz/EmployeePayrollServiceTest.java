package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
