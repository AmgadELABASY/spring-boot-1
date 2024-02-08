package com.example.demo.controllers;

import com.example.demo.dao.IEmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeControleur {
    @Autowired
    private IEmployeeDAO employeeDAO;
}
