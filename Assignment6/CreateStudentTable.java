package com.soch.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudentTable 
{

public static void main(String[] args) throws ClassNotFoundException, SQLException {

 //1. Load Driver

 Class.forName("com.mysql.cj.jdbc.Driver");

 //2. Establish Connection

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soch?serverTimezone=UTC", "root", "");

 //3. Create statement

Statement st = con.createStatement();

 //4. Send and execute sql query

String query = "CREATE TABLE students (id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,"

 + "name varchar(100))";

st.execute(query);

 //5. Close
 
st.close();  

}

}