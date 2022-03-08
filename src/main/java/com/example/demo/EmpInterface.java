package com.example.demo;

import java.util.List;

public interface EmpInterface {

	public Employee createEmp(Employee emp);
    public List<Employee> findAllEmp();
    public Employee findEmpByID(int id); 
	public Employee updateEmp(Employee emp);
	public void deleteEmp(int id);
}
