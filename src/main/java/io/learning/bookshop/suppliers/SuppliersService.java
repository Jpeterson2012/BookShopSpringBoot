package io.learning.bookshop.suppliers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SuppliersService {
    @Autowired
    SuppliersRepository suppliersRepository;

    public List<Suppliers> getAllSuppliers() {
        List<Suppliers> suppliers = new ArrayList<>();
        suppliersRepository.findAll().forEach(suppliers::add);
        return suppliers;
    }
    public Optional<Suppliers> getSuppliers(int id) {return suppliersRepository.findById(id);};
    public void addSuppliers(Suppliers suppliers) {suppliersRepository.save(suppliers);};
    public void updateSuppliers(int id, Suppliers suppliers) {suppliersRepository.save(suppliers);};
    public void deleteSuppliers(int id) {suppliersRepository.deleteById(id);};
}
