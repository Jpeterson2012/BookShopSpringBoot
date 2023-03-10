package io.learning.bookshop.members;

import org.springframework.data.repository.CrudRepository;

public interface MembersRepository extends CrudRepository<Members, Integer> {
}
