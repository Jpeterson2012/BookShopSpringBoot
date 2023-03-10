package io.learning.bookshop.sales;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SalesController {
    @Autowired
    SalesService salesService;

    @GetMapping("/sales")
    public List<Sales> getAllSales() {return salesService.getAllSales();};

    @PostMapping("/sales")
    public void addSales(@RequestBody Sales sales) {salesService.addSales(sales);};

    @PutMapping("/sales/{id}")
    public void updateSales(@PathVariable int id, @RequestBody Sales sales) {salesService.updateSales(id, sales);};

    @DeleteMapping("/sales/{id}")
    public void deleteSales(@PathVariable int id) {salesService.deleteSales(id);};
}
