package io.learning.bookshop.purchases;

import org.springframework.data.repository.CrudRepository;

public interface PurchasesRepository extends CrudRepository<Purchases, Integer> {
}
