package com.anudip.CrudOperation.service;

import java.util.List;

import com.anudip.CrudOperation.entity.Emploiee;

public interface EmploieeService 
{
	
	//saving details of Emploiee 
		Emploiee saveEmploiee(Emploiee emp);
		
		//getting all details of Emploiee 
		List<Emploiee> getAllEmploiee();
		
		//getting details of Emploiee based on uid
		Emploiee getEmploieeById(int uid);
		
		//getting details of Emploiee based on uid & change mentioned details 
		Emploiee updateEmploieeById(Emploiee emp, int uid);
		
		//getting details of Emploiee based on uid & delete mentioned Emploiee
		void deleteEmploieeById(int uid);
		
		
		List<Emploiee> getEmpName(String empName);

		List<Emploiee> getEmpAddress(String empAddress);
		
		Emploiee getEmpPhone(long empPhone);


}
