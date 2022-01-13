package DAO;


//database

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.RegiM;


import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class RegiDAO {

  public int registeruser(RegiM Regis) throws ClassNotFoundException {
      int result = 0;
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      String DBurl ="jdbc:sqlserver://192.168.52.71:1433;databaseName=Trainee_may19";
		String user = "TestDB";
		String pass ="TestDB";
          try
          {
          	Connection con = DriverManager.getConnection(DBurl, user, pass); //name of our fields
          	 PreparedStatement preparedStatement = con.prepareStatement("insert into RegiB VALUES( ?, ?, ?, ?, ?)"); //insert  queries
            {

            	 preparedStatement.setString(1, Regis.getFname());
                 preparedStatement.setString(2, Regis.getLname());
                 preparedStatement.setString(3, Regis.getPhone());
                 preparedStatement.setString(4, Regis.getUsername());
                 preparedStatement.setString(5, Regis.getPassword());
               
         

              System.out.println(preparedStatement);
             
              result = preparedStatement.executeUpdate();
    }
     
          }catch (Exception e) {
          	System.out.println("oops error");
							}

//         

          return result;
          
      
  }

  private void printSQLException(SQLException ex) {
      for (Throwable e: ex) {
          if (e instanceof SQLException) {
              e.printStackTrace(System.err);
              System.err.println("SQLState: " + ((SQLException) e).getSQLState());
              System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
              System.err.println("Message: " + e.getMessage());
              Throwable t = ex.getCause();
              while (t != null) {
                  System.out.println("Cause: " + t);
                  t = t.getCause();
              }
          }
      }
  }
}