package io.learning.bookshop.employees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeesController {
    @Autowired
    EmployeesService employeesService;

    @GetMapping("/employees")
    public List<Employees> getAllEmployees () {return employeesService.getAllEmployees();};

    @GetMapping("/employees/{id}")
    public Optional<Employees> getEmployees(@PathVariable int id) {return employeesService.getEmployees(id);};

    @PostMapping("/employees")
    public void addEmployees(@RequestBody Employees employees) {employeesService.addEmployees(employees);};

    @PutMapping("/employees/{id}")
    public void updateEmployees(@PathVariable int id, @RequestBody Employees employees) {
        employeesService.updateEmployees(id, employees);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployees(@PathVariable int id) {employeesService.deleteEmployees(id);};
}
