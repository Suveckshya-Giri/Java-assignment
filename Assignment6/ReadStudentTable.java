package com.soch.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadStudentTable { 

public static void main(String[] args) throws ClassNotFoundException, SQLException {

 //1. Load Driver

 Class.forName("com.mysql.cj.jdbc.Driver");

 //2. Establish Connection

Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/soch?serverTimezone=UTC","root", "");

 //3. Create statement

Statement st = con.createStatement();

 //4. Send and execute sql query

 String query = "SELECT * from employees";

boolean rs  = st.execute(query);

System.out.println("Possible ResultSet :" + rs);

if(rs)
{
	ResultSet r= st.executeQuery(query);


while(r.next())

{

System.out.println("ID = "+r.getInt(1));

System.out.println("Name = "+r.getString(2));


}
}

 //5. close the connection

con.close();

}

}