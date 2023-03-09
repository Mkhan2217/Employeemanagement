package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);

	Employee getEmployeeById(Long employeeId);

	Employee updateEmployee(Long employeeId, Employee employee);

	List<Employee> getListOfEmployees();

	void deleteEmployeeById(Long employeeId);

}
