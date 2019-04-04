package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.bean.MuthuBean;
import com.training.dao.CreateUserDAO;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<LoginBean> list = new ELearningDAO().getLogins(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(LoginBean temp : list){
			Object[]  obj = new Object[2]; 
			obj[0] = temp.getUserName(); 
			obj[1] = temp.getPassword(); 
			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	@DataProvider(name = "muthu-inputs")
	public Object [][] getDBData1() {

		List<MuthuBean> list = new CreateUserDAO().getUser(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(MuthuBean temp : list){
			Object[]  obj = new Object[7]; 
			//obj[0] = temp.getUserName(); 
			//obj[1] = temp.getPassword();
			obj[0] = temp.getfirstname();
			obj[1] = temp.getlastname();
			obj[2] = temp.getemail();
			obj[3] = temp.getphone();
			obj[4] = temp.getloginname();
			obj[5] = temp.getloginpwd();
			obj[6] = temp.getprofile();
			
					
			result[count ++] = obj; 
		}
		
		
		return result;
	}

	
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
		String fileName ="C:\\SeleniumProject\\UserData_ELTC_081.xlsx"; 
		//String sheetName = "Sheet1";
		return new ApachePOIExcelRead().getExcelContent(fileName); // if need add string "sheetName" for more than one sheets
	}
	
	// the below needed if we have more than one sheets
	
	/*@DataProvider(name = "excel-inputs1")
	public Object[][] getExcelData1(){
		String fileName ="C:\\SeleniumProject\\UserData_ELTC_081.xlsx"; 
		//String sheetName = "Sheet2";
		return new ApachePOIExcelRead().getExcelContent(fileName,sheetName); 
	}
	*/
	
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:\\SeleniumProject\\UserData_ELTC_081.xlsx", "Sheet1"); 
	}
}
