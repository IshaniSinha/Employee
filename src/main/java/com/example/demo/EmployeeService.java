package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EmployeeService implements EmpInterface {

	@Autowired
	private EmployeeRepository EmpRepo;

	@Override
	public Employee createEmp(Employee emp) {
		return EmpRepo.save(emp);
	}

	@Override
	public List<Employee> findAllEmp() {
		return (List<Employee>) EmpRepo.findAll();
	}

	@Override
	public Employee findEmpByID(int id) {
		return EmpRepo.findById(id).orElse(null);

	}

	@Override
	public Employee updateEmp(Employee emp) {
		return EmpRepo.save(emp);
	}

	@Override
	public void deleteEmp(int id) {
		EmpRepo.deleteById(id);

	}

}
