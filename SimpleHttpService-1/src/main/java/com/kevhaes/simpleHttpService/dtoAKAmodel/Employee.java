/**
 * @author KevHaes
 *
 */
package com.kevhaes.simpleHttpService.dtoAKAmodel;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author KevHaes
 *
 */
//class is annotated with @Entity, indicating that it is a JPA entity. (Because no @Table annotation exists,
//it is assumed that this entity is mapped to a table named Employee.)
//-->  @Table(name="myOwntablename")//change myOwntablename in desired name.
@Entity
//@Table(name = "employee")
public class Employee {
	/////////////// ATRIBUTES ///////////////
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// @Column(name = "firstName")
	private String firstname;

	// @Column(name = "lastName")
	private String lastname;

	// @Column(name = "salary")
	private int salary;

	@Enumerated(EnumType.STRING)
	// @Column(name = "role")
	private Role role;

	/////////////// CONSTRUCTORS ///////////////

	public Employee(Long id, String firstname, String lastname, int salary, Role role) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.role = role;
		this.salary = salary;
	}

	public Employee() {
	}

	/////////////// GETTERS & SETTERS ///////////////
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstname;
	}

	/**
	 * @param firstname the firstName to set
	 */
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastname;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastname = lastName;
	}

	/**
	 * @return the role
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/////////////// TOSTRING ///////////////
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary
				+ ", role=" + role + "]";
	}

	/////////////// METHODS ///////////////

}
