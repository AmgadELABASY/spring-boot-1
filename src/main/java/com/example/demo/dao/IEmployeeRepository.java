package com.example.demo.dao;

import com.example.demo.beans.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmployeeRepository extends CrudRepository<Employee,Long> {

}
