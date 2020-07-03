/**
 * @author KevHaes
 *
 */
package com.kevhaes.simpleHttpService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevhaes.simpleHttpService.dao.InterfaceEmployeeDao;
import com.kevhaes.simpleHttpService.dtoAKAmodel.Employee;

/**
 * @author KevHaes
 *
 * 
 */
@Service
public class EmployeeService implements InterfaceEmployeeService {

	/////////////// ATRIBUTES ///////////////

	// Autowired instantiates the methods of the jpaRepository in
	// interfaceEmployeeDao
	@Autowired
	InterfaceEmployeeDao interfaceEmployeeDao;

	/////////////// CRUD METHODS to implement ///////////////
	@Override // why?
	public Employee createEmployee(Employee employee) {
		return interfaceEmployeeDao.save(employee);
	}

	@Override
	public List<Employee> showAllEmployees() {
		return interfaceEmployeeDao.findAll();
	}

	@Override
	public Employee showOneEmployeeById(Long id) {
		return interfaceEmployeeDao.findById(id).get();
	}

	@Override
	public void deleteEmployeeById(Long id) {
		interfaceEmployeeDao.deleteById(id);
	}

	@Override
	public Employee UpdateEmployee(Employee employee) {
		return interfaceEmployeeDao.save(employee);

	}

}
