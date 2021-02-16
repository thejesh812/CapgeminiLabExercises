package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {

	public Employee getEmployeeDetails(int id,String name,double salary,String designation);
 
	
	public String findInsuranceScheme(Employee emp);
	
	
	
	public void displayEmployeeDetails(Employee emp);

}
