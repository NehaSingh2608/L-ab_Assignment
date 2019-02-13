package com.cg.eis.service;

import com.cg.eis.bean.Employee;

interface EmployeeServices {
	public Employee setDetals(int id,String name,int salary,String deg);
	public void insuranceScheme(int salary,String Designation);
	public void getDetails();
}
public class Service implements EmployeeServices{
	
	Employee e;
	
	@Override
	public Employee setDetals(int id, String name, int salary, String deg) {
		// TODO Auto-generated method stub
		e=new Employee(id,name,salary,deg);
		return e;
	}

	@Override
	public void insuranceScheme(int salary, String Designation) {
		// TODO Auto-generated method stub
		if(Designation.equals("System Associate") && (salary>5000 && salary <20000))
			e.setInsuranceScheme("C");
		else if(Designation.equals("Programmer") && (salary>20000 && salary <40000))
			e.setInsuranceScheme("B");
		else if(Designation.equals("Manager") && (salary>=40000))
			e.setInsuranceScheme("A");
		else if(Designation.equals("Clerk") && (salary<5000))
			e.setInsuranceScheme("No Scheme");
	}
	public void getDetails()
	{
		System.out.println("Employee id" +e.getId()+"\nEmployee name:"+e.getName()+"\nEmployee Salary:"+e.getSalary()+"\nEmployee Insurance Scheme:"+e.getInsuranceScheme());
		
	}

	
}