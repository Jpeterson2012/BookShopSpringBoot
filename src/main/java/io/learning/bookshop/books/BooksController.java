package io.learning.bookshop.books;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BooksController {
    @Autowired
    BooksService booksService;

    @RequestMapping("/books")
    public List<Books> getAllBooks() {return booksService.getAllBooks();};

    @RequestMapping("/books/{id}")
    public Optional<Books> getBooks(@PathVariable int id) {
        return booksService.getBook(id);
    }

    @PostMapping("/books")
    public void addBooks(@RequestBody Books books) {
        booksService.addBooks(books);
    }

    @PutMapping("/books/{id}")
    public void updateBooks(@PathVariable int id, @RequestBody Books books) {
        booksService.updateBooks(id, books);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBooks(@PathVariable int id) {
        booksService.deleteBooks(id);
    }
}
