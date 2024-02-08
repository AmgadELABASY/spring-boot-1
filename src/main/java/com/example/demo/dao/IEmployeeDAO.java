package com.example.demo.dao;

import com.example.demo.beans.Employee;

import java.util.List;

public interface IEmployeeDAO {
    public List<Employee> findAll();
    public void add(Employee employee);
}
