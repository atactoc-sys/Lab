package com.anudip.CrudOperation.reposototy;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anudip.CrudOperation.entity.Emploiee;



public interface EmploieeRepository extends JpaRepository<Emploiee, Integer>
{
	
	@Query("select u from Emploiee u where u.empName = ?1")
	List<Emploiee> getEmpName(String empName);

	@Query("select u from Emploiee u where u.empAddress = ?1S")
	List<Emploiee> getEmpAddress(String empAddress);
	
	@Query("select u from Customer u where u.empPhone = ?1")
	Emploiee getEmpPhone(long empPhone);

}
