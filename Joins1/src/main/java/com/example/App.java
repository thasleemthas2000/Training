package com.example;

import java.sql.*;

public class App 
{
    public static void main( String[] args )
    {
    	Connection con;
	try {
		 con = DriverManager.getConnection("jdbc:oracle:thin:@10.90.1.105:1521/DEV", "HR", "HR");
		 
    		 System.out.println(con);
    		 
    		 
    	 	} catch (Exception e) {
    	 		e.printStackTrace();
	}

    }
}
