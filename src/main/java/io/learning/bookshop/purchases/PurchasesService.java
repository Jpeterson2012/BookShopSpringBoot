package io.learning.bookshop.purchases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PurchasesService {
    @Autowired
    PurchasesRepository purchasesRepository;

    public List<Purchases> getAllPurchases() {
        List<Purchases> purchases = new ArrayList<>();
        purchasesRepository.findAll().forEach(purchases::add);
        return purchases;
    }
    public Optional<Purchases> getPurchases(int id) {return purchasesRepository.findById(id);};
    public void addPurchases(Purchases purchases) {purchasesRepository.save(purchases);};
    public void updatePurchases(int id, Purchases purchases) {purchasesRepository.save(purchases);};
    public void deletePurchasesById(int id) {purchasesRepository.deleteById(id);};
    public void deletePurchases(Purchases purchases) {purchasesRepository.delete(purchases);};
}
