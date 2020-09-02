package com.l7.dp.Composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeDirectory implements Employee {
	private List<Employee> employeeList=new ArrayList<Employee>();

	@Override
	public void getDetails() {
		for (Employee employee : employeeList) {
			employee.getDetails();
		}
		
	}
	public void addEmployee(Employee emp) { 
	        employeeList.add(emp); 
	} 
	       
    public void removeEmployee(Employee emp){ 
        employeeList.remove(emp); 
    } 
}
