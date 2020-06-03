package extrue.springframework.librarywebapp.controllers;

import extrue.springframework.librarywebapp.domain.Book;
import extrue.springframework.librarywebapp.repositories.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SearchController {

    private final BookRepository bookRepository;

    public SearchController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/restbooks")
    public Iterable<Book> restBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/restbook")
    public Iterable<Book> restBook(@RequestParam(name = "str") String s) {
        return bookRepository.findByTitleStartingWith(s);
    }

}
