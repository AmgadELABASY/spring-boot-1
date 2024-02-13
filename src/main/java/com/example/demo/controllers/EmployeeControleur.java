package com.example.demo.controllers;

import com.example.demo.beans.Employee;
import com.example.demo.dao.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeControleur implements IEmployeController {

    @Autowired
    private IEmployeeRepository employeeRepository;

    @GetMapping("/home")
    public String displayHome(Model model) {
       List<Employee>  employees = (List<Employee>) employeeRepository.findAll();
       model.addAttribute("employees", employees);
       model.addAttribute("employee",new Employee());
        return "view_home";
    }
    @PostMapping("/addemployee")
    public String addEmployee(@ModelAttribute Employee employee){
        employeeRepository.save(employee);
        return "redirect:/employee/home";
    }

    @Override
    @RequestMapping(value = "/{id}")
    public String displayEmployee(@PathVariable(name = "id") Long id, Model model) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        if(employeeOptional.isPresent()){
            Employee employee = employeeOptional.get();
            model.addAttribute("employee",employee);
            return "view_employee";
        }else {
            return "redirect:/employee/home";
        }

    }


}
