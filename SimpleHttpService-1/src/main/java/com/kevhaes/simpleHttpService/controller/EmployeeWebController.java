/**
 * @author KevHaes
 *
 */
package com.kevhaes.simpleHttpService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kevhaes.simpleHttpService.dtoAKAmodel.Employee;
import com.kevhaes.simpleHttpService.dtoAKAmodel.Role;
import com.kevhaes.simpleHttpService.service.EmployeeService;

/**
 * @author KevHaes
 *
 */
@Controller
@RequestMapping("/employees")
public class EmployeeWebController {
	/////////////// ATRIBUTES ///////////////
	@Autowired
	EmployeeService employeeService;
/////////////// CRUD METHODS ///////////////

	@PostMapping("/addOneEmployeeForm/addemployee")
	public String addemployee(Employee employee) {
		employeeService.createEmployee(employee);
		return "employeesoview";
	}

	@GetMapping
	public String showAllEmployeesView(Model model) {
		model.addAttribute("employees", employeeService.showAllEmployees());
		return "employeesoverview";
	}

	@GetMapping("/addOneEmployeeForm")
	public String showAddOneEmployeeForm(Employee employee) {
		return "addOneEmployeeForm";
	}

	@GetMapping("/editOneEmployeeForm/{id}")
	public String showEditFormWithId(@PathVariable("id") Long id, Model model) {
		model.addAttribute("employee", employeeService.showOneEmployeeById(id));
		return "editOneEmployeeForm";
	}

	@PostMapping("/editOneEmployeeForm/{id}")
	public String UpdateEmployee(Employee employee) {
		employeeService.UpdateEmployee(employee);
		return "employeesoverview";
	}

	@GetMapping(path = "/delete/{id}")
	public String showDeleteForm(@PathVariable("id") Long id, Model model) {
		model.addAttribute("employee", employeeService.showOneEmployeeById(id));
		return "deleteOneEmployee";
	}

	@PostMapping(path = "/delete/{id}")
	public String deleteOneEmployee(@PathVariable("id") Long id) {
		employeeService.deleteEmployeeById(id);
		return "employeesoverview";
	}

	@GetMapping(path = "/role/{role}")
	public String showEmployeesByRole(@PathVariable("role") Role role, Model model) {
		model.addAttribute("employees", employeeService.showAllEmployeesByRoll(role));
		return "employeesByRoleView";
	}
}