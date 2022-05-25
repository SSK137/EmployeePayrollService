package com.bridgelabz;

import java.io.File;
import java.io.IOException;
public class EmployeePayrollFileIOService {
    /*---Method To Create New File to particular Directory---*/
    public boolean CreateFile(){
        File file=new File("//home//hp//IdeaProjects//EmployeePayrollService//src//test.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File Created "+file.getName());
                return true;
            }
            else {
                System.out.println("File Not Created ! It's might be already Exist");
                return false;
            }
        } catch (IOException e) {
            System.out.println("Exception");
            return false;
        }
    }
    /*---Method to Check file is Already exist or Not---*/
    public boolean CheckExistOrNot(){
        try{
            File file=new File("//home//hp//IdeaProjects//EmployeePayrollService//src//test.txt");
            if(file.exists()){
                System.out.println("File already Exist");
                return true;
            }
            else {
                file.createNewFile();
                System.out.println("New File Created ");
                return false;
            }
        } catch (IOException e) {
            System.out.println("Exception");
            return false;
        }
    }
    /*---Method to Delete the file from particular Directory---*/
    public boolean DeleteFileOperation(){
        File file=new File("//home//hp//IdeaProjects//EmployeePayrollService//src//test.txt");
        if(file.delete()){
            System.out.println(file.getName()+" Deleted !!!");
            return true;
        }
        else {
            System.out.println(file.getName()+" Such file does not exist to delete !!!");
            return false;
        }
    }
    /*---Method to List All the Files and Directories---*/
    public boolean ListOfAllFilesAndDirectory() {
        File file = new File("//home//hp//IdeaProjects//EmployeePayrollService//src//");
        File[] files;
        String[] FileNames;
        files = file.listFiles();
        FileNames = file.list();
        if(FileNames.length==0){
            System.out.println("Directory Is Empty !!!");
            return false;
        }else {
            //Display Files With Directory
            System.out.println("\nFile Names With Directories\n");
            for (File s1 : files) {
                System.out.println(s1);
            }
            //Display Folders Name and Files With Extension
            System.out.println("\nFile Name With extension and Folder Names Available In Directory\n");
            for (String filename : FileNames) {
                System.out.println(filename);
            }
            return true;
        }
    }
}
