package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
		}
	@GetMapping("/employees")
	private List<Employee> getListOfEmployees() {
		return employeeService.getListOfEmployees();

	}
	
	@GetMapping("/employees/{id}")
	private Employee getEmployeeById(@PathVariable("id") Long employeeId) {
		return employeeService.getEmployeeById(employeeId);

	}
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable("id") Long employeeId,@RequestBody Employee employee) {
		return employeeService.updateEmployee(employeeId,employee);
		
	}@DeleteMapping("/employees/{id}")
	 private void deleteEmployeeById(@PathVariable("id") Long employeeId) {
			 employeeService.deleteEmployeeById(employeeId);

		}
	
	
//	@Transactional
//	@DeleteMapping("/employees/firstName/{firstName}")
//	 private void deleteEmployeeByFirstName(@PathVariable("firstName") String EmployeeFirstName) {
//		 employeeService.deleteEmployeeByFirstName(EmployeeFirstName);
//
//	}
	

}
