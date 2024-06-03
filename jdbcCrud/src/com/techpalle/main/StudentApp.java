package com.techpalle.main;
import com.techpalle.jdbc.*;

import com.techpalle.jdbc.StudentServices;
import com.techpalle.jdbc.*;
public class StudentApp {
	
	public static void main(String[] args) {
		//create studenet table
		//StudentServices.creating();
		
		//inserting two students into table
		//StudentServices.inserting("kishore", "java", "k@gmail.com");
		//StudentServices.inserting("balaji", "c", "b@gmail.com");	
		//StudentServices.inserting("jagadeesh", "java", "jagadeesh@gmail.com.com");
		//StudentServices.inserting("narayana", ".net", "narayana@gmail.com.com");
		
		//deleting second row from table
		//StudentServices.deleting(2);
		
		//update kishore's email and sub
		//StudentServices.updating(1, "kishore@gmail.com", "python");
		
		
		//Display all student table
		
		StudentServices.reading();
	}
}

















