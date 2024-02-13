package com.example.demo.controllers;

import com.example.demo.beans.Employee;
import org.springframework.ui.Model;

public interface IEmployeController {
    public String displayHome(Model model);
    public String addEmployee(Employee employee);
    public String displayEmployee(Long id,  Model model);

}
