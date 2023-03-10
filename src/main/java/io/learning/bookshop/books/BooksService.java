package io.learning.bookshop.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BooksService {

    @Autowired
    private BooksRepository booksRepository;

    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<>();
        booksRepository.findAll()
                .forEach(books::add);
        return books;
    }
    public Optional<Books> getBook(int id) {
        return booksRepository.findById(id);
    }
    public void addBooks(Books books) {
        booksRepository.save(books);
    }
    public void updateBooks(int id, Books books) {
        booksRepository.save(books);
    }
    public void deleteBooks(int id) {
        booksRepository.deleteById(id);
    }
}
