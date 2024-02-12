package com.example.demo.controllers;

import com.example.demo.beans.Employee;
import com.example.demo.dao.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeControleur {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @GetMapping("/findAllEmployee")
    public String findAllEmployee(Model model) {
       List<Employee>  employees = (List<Employee>) employeeRepository.findAll();
       model.addAttribute("employees", employees);
       model.addAttribute("employee",new Employee());
        return "view_employees";
    }
    @PostMapping("/addemployee")
    public String addEmployee(@ModelAttribute Employee employee, Model model){
        employeeRepository.save(employee);
        return "redirect:/findAllEmployee";
    }
}
