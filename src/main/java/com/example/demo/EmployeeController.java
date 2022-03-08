package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@PostMapping(value = "/saveEmp")
	public Employee createEmp(@RequestBody Employee emp) {
		empService.createEmp(emp);
		return emp;
	}

	@GetMapping(value = "/getAllEmp")
	public List<Employee> findAllEmp() {
		return empService.findAllEmp();
	}

	@PutMapping("/updateEmp")
	public Employee updateEmp(@RequestBody Employee emp) {
		return empService.updateEmp(emp);
	}

	@DeleteMapping("/deleteEmp/{id}")
	public void deleteEmp(@PathVariable int id) {
		empService.deleteEmp(id);

	}

	@GetMapping(value = "/getEmpById/{id}")
	public Employee getEmpById(@PathVariable int id) {
		return empService.findEmpByID(id);

	}

}
