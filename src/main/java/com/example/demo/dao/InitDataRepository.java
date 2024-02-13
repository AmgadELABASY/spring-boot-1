package com.example.demo.dao;

import com.example.demo.beans.Employee;
import com.example.demo.enums.Fonction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class InitDataRepository implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        // Vider la base de données existante pour éviter les doublons
        employeeRepository.deleteAll();

        // Ajouter les employés
        employeeRepository.save(new Employee(1,"Karim Mahmoud", "kmshawky20@gmail.com", "0097450413948", "Egypt", Fonction.DEV_WEB));
        employeeRepository.save(new Employee(2,"Fran Wilson", "franwilson@mail.com", "(204) 619-5731", "C/ Araquil, 67, Madrid, Spain", Fonction.DEV_OPS));
        employeeRepository.save(new Employee(3,"Maria Anders", "mariaanders@mail.com", "(503) 555-9931", "25, rue Lauriston, Paris, France", Fonction.CHEF_PROJET));
        employeeRepository.save(new Employee(4,"Thomas Hardy", "thomashardy@mail.com", "(171) 555-2222", "89 Chiaroscuro Rd, Portland, USA", Fonction.DEV_AI));

    }

    @Autowired
    private IEmployeeRepository employeeRepository;
}