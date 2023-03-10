package io.learning.bookshop.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalesService {
    @Autowired
    SalesRepository salesRepository;

    public List<Sales> getAllSales() {
        List<Sales> sales = new ArrayList<>();
        salesRepository.findAll().forEach(sales::add);
        return sales;
    }
    public void addSales(Sales sales) {salesRepository.save(sales);};
    public void updateSales(int id, Sales sales) {salesRepository.save(sales);};
    public void deleteSales(int id) {salesRepository.deleteById(id);};
}
