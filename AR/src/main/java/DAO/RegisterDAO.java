package DAO;
//database

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.RegiM;
import Model.RegisterM;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

public class RegisterDAO {

     public RegisterM checkLogin(String username , String password) throws SQLException ,ClassNotFoundException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String DBurl ="jdbc:sqlserver://192.168.52.71:1433;databaseName=Trainee_may19";
		String user1 = "TestDB";
		String pass ="TestDB";
            
            
            	Connection con = DriverManager.getConnection(DBurl, user1, pass); //name of our fields
            	 PreparedStatement preparedStatement = con.prepareStatement("select * from RegiB where username = ? and password = ?"); //insert  queries
              
             
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password );
           

                
               
                ResultSet result = preparedStatement.executeQuery();
                RegisterM user = null;
                if(result.next()) {
                	user = new RegisterM();
                	user.setEmail(username);
                	user.setPassword(password);
                	
                	
                }
                con.close();
               
                return user;
                
      
              }       
            
}
//           
            
        
    

    
