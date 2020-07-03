/**
 * @author KevHaes
 *
 */
package com.kevhaes.simpleHttpService.service;

import java.util.List;

import com.kevhaes.simpleHttpService.dtoAKAmodel.Employee;

/**
 * @author KevHaes
 *
 */
public interface InterfaceEmployeeService {

	// CRUD methods to be implemented in the actual EmployeeService

	public Employee createEmployee(Employee employee);

	public List<Employee> showAllEmployees();

	public Employee showOneEmployeeById(Long id);

	public void deleteEmployeeById(Long id);

	public Employee UpdateEmployee(Employee employee);
}
