package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee) ;
	}
	@Override
	public List<Employee> getListOfEmployees() {
		return  employeeRepository.findAll();
	}


	@Override
	public Employee getEmployeeById(Long employeeId) {
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public Employee updateEmployee(Long employeeId, Employee employee) {
		 Employee emp1= employeeRepository.findById(employeeId).get();
		 if (Objects.nonNull(employee.getFirstName())&&!"".equalsIgnoreCase(employee.getFirstName())) {
			 emp1.setFirstName(employee.getFirstName());
			 }
		if (Objects.nonNull(employee.getLastName())&&!"".equalsIgnoreCase(employee.getLastName())) {
				 emp1.setLastName(employee.getLastName());
			}
		if (Objects.nonNull(employee.getEmail())&&!"".equalsIgnoreCase(employee.getEmail())) {
			 emp1.setEmail(employee.getEmail());
		}
		if (Objects.nonNull(employee.getGender())&&!"".equalsIgnoreCase(employee.getGender())) {
			 emp1.setGender(employee.getGender());
		}
		return employeeRepository.save(emp1);
		
		
	}

	 
	@Override
	public void deleteEmployeeById(Long employeeId) {
		 employeeRepository.deleteById(employeeId);
		
	}
	 

	
	 

	 
	 

}
