package com.training.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.training.bean.LoginBean;
import com.training.bean.MuthuBean;
import com.training.connection.GetConnection;
import com.training.utility.LoadDBDetails;

// Data Access Object 
public class CreateUserDAO {
	
	Properties properties; 
	
	public CreateUserDAO() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/sql.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<MuthuBean> getUser(){
		String sql = properties.getProperty("get.users"); 
		
		GetConnection gc  = new GetConnection(); 
		List<MuthuBean> list = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list = new ArrayList<MuthuBean>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				MuthuBean temp = new MuthuBean(); 
				//temp.setUserName(gc.rs1.getString(1));
				//temp.setPassword(gc.rs1.getString(2));
				temp.setfirstname(gc.rs1.getString(1));
				temp.setlastname(gc.rs1.getString(2));
				temp.setemail(gc.rs1.getString(3));
				temp.setphone(gc.rs1.getString(4));
				temp.setloginname(gc.rs1.getString(5));
				temp.setloginpwd(gc.rs1.getString(6));
				temp.setprofile(gc.rs1.getString(7));
				
				

				list.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
	
	public static void main(String[] args) {
		new CreateUserDAO().getUser().forEach(System.out :: println);
	}
	
	
}
