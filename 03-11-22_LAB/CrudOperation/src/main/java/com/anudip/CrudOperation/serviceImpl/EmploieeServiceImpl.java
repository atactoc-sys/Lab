package com.anudip.CrudOperation.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.anudip.CrudOperation.entity.Emploiee;
import com.anudip.CrudOperation.exception.EmploieeNotFoundException;
import com.anudip.CrudOperation.reposototy.EmploieeRepository;
import com.anudip.CrudOperation.service.EmploieeService;

public class EmploieeServiceImpl implements EmploieeService
{

	@Autowired
	EmploieeRepository urepo;
	@Override
	public Emploiee saveEmploiee(Emploiee emp) 
	{
		
		return urepo.save(emp);
		
	}

	@Override
	public List<Emploiee> getAllEmploiee() 
	{
		return urepo.findAll();
		
	}

	@Override
	public Emploiee getEmploieeById(int uid) 
	{
		
		return urepo.findById(uid).orElseThrow(() -> new EmploieeNotFoundException("no user exists in table"));
		
	}

	@Override
	public Emploiee updateEmploieeById(Emploiee emp, int uid) 
	{
		
		Emploiee newEmp = urepo.findById(uid).orElseThrow(() -> new EmploieeNotFoundException("no user exists in table"));

		// updated value
		newEmp.setEmpName(emp.getEmpName());
		newEmp.setEmpPhone(emp.getEmpPhone());
		urepo.save(newEmp);
		return newEmp;
		
	}

	@Override
	public void deleteEmploieeById(int uid) 
	{
		
		urepo.findById(uid).orElseThrow(() -> new EmploieeNotFoundException("no user exists in table"));
		urepo.deleteById(uid);
		
	}

	@Override
	public List<Emploiee> getEmpName(String empName) 
	{
		
		return urepo.getEmpName(empName);
		
	}

	@Override
	public List<Emploiee> getEmpAddress(String empAddress) 
	{
		
		return urepo.getEmpAddress(empAddress);
		
	}

	@Override
	public Emploiee getEmpPhone(long empPhone) 
	{
		
		return urepo.getEmpPhone(empPhone);
		
	}

	
	
}
