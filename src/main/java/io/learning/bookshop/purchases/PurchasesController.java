package io.learning.bookshop.purchases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PurchasesController {
    @Autowired
    PurchasesService purchasesService;

    @GetMapping("/purchases")
    public List<Purchases> getAllPurchases() {return purchasesService.getAllPurchases();};

    @GetMapping("/purchases/{id}")
    public Optional<Purchases> getPurchases(@PathVariable int id) {return purchasesService.getPurchases(id);};

    @PostMapping("/purchases")
    public void addPurchases(@RequestBody Purchases purchases) {purchasesService.addPurchases(purchases);};

    @PutMapping("/purchases/{id}")
    public void updatePurchases(@RequestBody Purchases purchases, @PathVariable int id) {
        purchasesService.updatePurchases(id, purchases);
    }

    @DeleteMapping("/purchases")
    public void deletePurchases(@RequestBody Purchases purchases) {purchasesService.deletePurchases(purchases);};

    @DeleteMapping("/purchases/{id}")
    public void deletePurchasesById(@PathVariable int id) {purchasesService.deletePurchasesById(id);};
}
