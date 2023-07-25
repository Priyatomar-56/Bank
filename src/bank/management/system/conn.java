
package bank.management.system;

import java.sql.*;

// jDBC connectivity require 5 steps :
// 1: Register the driver
// 2: Create Connection
// 3: Create Statement
// 4: Execute Query 
// 5 : Close Connection.
public class conn {
     Connection c;
     Statement s;
     
   public conn(){
       
      
//       use try because mysql is an external entity h
  try{
//      Class for registeration of driver
// No need to register driver it automatically register.
//Class.forName(com.mysql.cj.jdbc.Driver);
//create connection
    c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "priya");
// create statement
    s=c.createStatement();
  }
  catch(Exception e){
      System.out.println(e);
  }

   } 
   
}
