/**
 * @author KevHaes
 *
 */
package com.kevhaes.simpleHttpService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevhaes.simpleHttpService.dtoAKAmodel.Employee;

/**
 * @author KevHaes
 *
 */
public interface InterfaceEmployeeDao extends JpaRepository<Employee, Long> {

// JpaRepository is JPA specific extension of Repository . 
// It contains a full API of CrudRepository and PagingAndSortingRepository . 
// So it contains API for basic CRUD operations and also API for pagination and sorting.

// When we don't need the full functionality provided by JpaRepository and PagingAndSortingRepository,
// we can simply use the CrudRepository.

// extends PagingAndSortingRepository which means it has all methods present in the CrudRepository as well.

//Downside:
//	by extending e.g. CrudRepository, we expose a complete set of persistence method at once. 
//	This is probably fine in most circumstances 
//	as well but we might run into situations where we'd like to 
//	gain more fine-grained control over the methods exposed, 
//	e.g. to create a ReadOnlyRepository that doesn't include the save(…) and delete(…) methods of CrudRepository
}