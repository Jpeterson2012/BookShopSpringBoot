package io.learning.bookshop.suppliers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SuppliersController {
    @Autowired
    SuppliersService suppliersService;

    @GetMapping("/suppliers")
    public List<Suppliers> getAllSuppliers() {return suppliersService.getAllSuppliers();};

    @GetMapping("/suppliers/{id}")
    public Optional<Suppliers> getSuppliers(@PathVariable int id) {return suppliersService.getSuppliers(id);};

    @PostMapping("/suppliers")
    public void addSuppliers(@RequestBody Suppliers suppliers) {suppliersService.addSuppliers(suppliers);};

    @PutMapping("/suppliers/{id}")
    public void updateSuppliers(@PathVariable int id, @RequestBody Suppliers suppliers) {suppliersService.updateSuppliers(id, suppliers);};

    @DeleteMapping("/suppliers/{id}")
    public void deleteSuppliers(@PathVariable int id) {suppliersService.deleteSuppliers(id);};

}
