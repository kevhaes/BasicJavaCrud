/**
 * @author KevHaes
 *
 */
package com.kevhaes.simpleHttpService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kevhaes.simpleHttpService.dtoAKAmodel.Employee;
import com.kevhaes.simpleHttpService.service.EmployeeService;

/**
 * @author KevHaes
 *
 */
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	/////////////// ATRIBUTES ///////////////

	@Autowired
	EmployeeService employeeService;

	/////////////// CRUD METHODS ///////////////

	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

	@GetMapping
	public List<Employee> showAllEmployees() {
		return employeeService.showAllEmployees();
	}

	@GetMapping(path = "{id}")
	public Employee showOneEmployeeById(@PathVariable("id") Long id) {
		return employeeService.showOneEmployeeById(id);
	}

	@DeleteMapping(path = "{id}")
	public void deleteEmployeeById(@PathVariable("id") Long id) {
		employeeService.deleteEmployeeById(id);
	}

	@PutMapping(path = "{id}")
	public Employee UpdateEmployee(@RequestBody Employee employeeToUpdate) {
		return employeeService.UpdateEmployee(employeeToUpdate);
	}

}
