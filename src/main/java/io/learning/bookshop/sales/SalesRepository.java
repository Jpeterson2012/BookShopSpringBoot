package io.learning.bookshop.sales;

import org.springframework.data.repository.CrudRepository;

public interface SalesRepository extends CrudRepository<Sales, Integer> {
}
