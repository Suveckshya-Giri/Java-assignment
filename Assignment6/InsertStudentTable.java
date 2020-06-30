package com.soch.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStudentTable {

public static void main(String[] args) throws ClassNotFoundException, SQLException {

//1. Load Driver

 Class.forName("com.mysql.cj.jdbc.Driver");

//2. Establish Connection

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soch?serverTimezone=UTC", "root", "");

//3. Create statement

Statement st = con.createStatement();

//4. Send and execute sql query

 String query = "INSERT INTO students (`name`) VALUES('subu')";

 st.execute(query);


//5. close the connection

con.close();


}
}