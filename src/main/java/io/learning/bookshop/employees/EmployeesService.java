package io.learning.bookshop.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeesService {
    @Autowired
    EmployeesRepository employeesRepository;

    public List<Employees> getAllEmployees () {
        List<Employees> employees = new ArrayList<>();
        employeesRepository.findAll().forEach(employees::add);
        return employees;
    }
    public Optional<Employees> getEmployees(int id) {
        return employeesRepository.findById(id);
    }
    public void addEmployees(Employees employees) {employeesRepository.save(employees);};
    public void updateEmployees(int id, Employees employees) {employeesRepository.save(employees);};
    public void deleteEmployees(int id) {employeesRepository.deleteById(id);};
}
