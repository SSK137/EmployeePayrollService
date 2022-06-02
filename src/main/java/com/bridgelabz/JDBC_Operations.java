package com.bridgelabz;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC_Operations {
    //Retrive All the Data from the table and display
    public List<EmployeeData> ReadAllDataFromTables(){
        String sql="SELECT * FROM employee_payroll";
        List<EmployeeData> employeeDataList=new ArrayList<>();
        try{
            Connection connection=DB_Connection.getConnection();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                int id=resultSet.getInt("id");
                String name=resultSet.getString("name");
                double salary=resultSet.getDouble("salary");
                String Start_Date=resultSet.getString("Start_Date");
                String Gender=resultSet.getString("Gender");
                employeeDataList.add(new EmployeeData(id,name,salary,Start_Date,Gender));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employeeDataList;
    }
    //Update the record in the table
    public static boolean UpdateRecord() {
        try(Connection conn = DB_Connection.getConnection();
            Statement statement = conn.createStatement();
        ) {
            String sql = "UPDATE employee_payroll SET salary=60000 WHERE name='SSK'";
            statement.executeUpdate(sql);
            System.out.println("Record Updated Successfully...");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    //Update record using PreparedStatement
    public static int UpdateQuery(double salary, String name) throws SQLException {
        String sql = "update employee_payroll set salary = ? where name = ?";
        PreparedStatement preparedStatement = DB_Connection.getConnection().prepareStatement(sql);
        preparedStatement.setDouble(1,salary);
        preparedStatement.setString(2,name);
        return preparedStatement.executeUpdate();
    }
    //Retrive data who have joined in a particular data range
    public boolean DisplayParticularData(){
        String sql="SELECT name FROM employee_payroll WHERE name = 'SSK' or  Start_Date BETWEEN CAST('2018-01-01' AS DATE) AND DATE(NOW());";
        try{
            Connection connection=DB_Connection.getConnection();
            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(sql);
            while (resultSet.next()){
                System.out.println(resultSet.getString("name"));
            }
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
