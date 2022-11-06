package com.anudip.CrudOperation.controller;

import java.util.List;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.anudip.CrudOperation.entity.Emploiee;
import com.anudip.CrudOperation.service.EmploieeService;



public class EmploieeController 
{
	
	@Autowired
	private EmploieeService us;
	
	//save user in db table using rest api PostMapping
	@PostMapping("/saveEmp")
	public ResponseEntity<Emploiee> saveEmploiee(@Valid @RequestBody Emploiee emp){
		return new ResponseEntity<Emploiee>(us.saveEmploiee(emp), HttpStatus.CREATED);
	}
	
	// fetch user details from db table using rest api GetMapping
	@GetMapping("/getAllEmp")
	public List<Emploiee> getAll(){
		return us.getAllEmploiee();
	}
	
	// fetch user details from db table using rest api GetMapping based on id
	@GetMapping("/getEmp/{uid}")
	public ResponseEntity<Emploiee> getEmploiee(@PathVariable("uid") int uid){
		return new ResponseEntity<Emploiee>(us.getEmploieeById(uid),HttpStatus.OK);
	}
	
	//update user details in db table using rest api PutMapping based on id
	@PutMapping("/updateEmp/{uid}")
	public ResponseEntity<Emploiee> updateEmploiee(@PathVariable("uid") int uid, @RequestBody Emploiee emp){
			return new ResponseEntity<Emploiee>(us.updateEmploieeById(emp, uid), HttpStatus.OK);
		}
		
		//delete user details in db table using rest api PutMapping based on id
	@DeleteMapping("/deleteEmp/{uid}")
	public ResponseEntity<String> deleteEmploiee(@PathVariable("uid") int uid){
		us.deleteEmploieeById(uid);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
				}
	@GetMapping("/getEmpn/{empName}")
	public List<Emploiee> getEmpName(@PathVariable String empName){
		return us.getEmpName(empName);
	}
	
	@GetMapping("/getEmpAddr/{empAddress}")
	public List<Emploiee> getEmpAddress(@PathVariable String empAddress){
		return us.getEmpAddress(empAddress);
	}
	
	@GetMapping("/getEmpPh/{EmpPhone}")
	public Emploiee getPhone(@PathVariable long empPhone){
		return us.getEmpPhone(empPhone);
	}

}
