package com.sis.student.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sis.student.entity.Employee;

@Repository
public interface StudentRepo extends CrudRepository<Employee, String> {

}
