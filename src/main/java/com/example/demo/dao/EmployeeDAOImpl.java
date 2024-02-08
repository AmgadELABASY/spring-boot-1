package com.example.demo.dao;

import com.example.demo.beans.Employee;
import com.example.demo.enums.Fonction;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeDAOImpl implements IEmployeeDAO {

    private List<Employee> employees;

    public EmployeeDAOImpl(){
        employees = new ArrayList<>();
        employees.add(new Employee("1", "Karim Mahmoud", "kmshawky20@gmail.com", "0097450413948", "Egypt", Fonction.DEV_WEB));
        employees.add(new Employee("2", "Fran Wilson", "franwilson@mail.com", "(204) 619-5731", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_OPS));

    }
    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employees);
    }

    @Override
    public void add(Employee employee) {
        employees.add(employee);
    }
}
