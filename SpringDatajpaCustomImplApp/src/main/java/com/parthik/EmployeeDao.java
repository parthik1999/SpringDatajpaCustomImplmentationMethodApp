package com.parthik;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	
	
	public List<Employee> findByAddress(String address);

//	for multiple feild also we can use
	public List<Employee> FindByNameAndAddress(String name,String address);
	//Here use And intersection
	
	public List<Employee> FindByOrAndAddress(String name,String address);
//	Here use Or means union
	
//	top 5
	public List<Employee> findTop5ByAddress(String address);
	
//	orderBy
	public List<Employee>findByAddressOrderBySalaryDesc(String address);
	
	
//	use your own method or create own query
	
//	@Query("select salary from Employee where empId=?1")
//	public int getSalByEmployeeId(int id);
	
//	If we want to use native Query
	
	@Query(value = "select salary from employee where empId=?1",nativeQuery = true)
	public int getSalByEmployeeId(int id);

}
 