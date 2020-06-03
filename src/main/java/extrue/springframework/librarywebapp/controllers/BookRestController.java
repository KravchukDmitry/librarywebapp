package extrue.springframework.librarywebapp.controllers;

import extrue.springframework.librarywebapp.domain.Author;
import extrue.springframework.librarywebapp.domain.Book;
import extrue.springframework.librarywebapp.repositories.AuthorRepository;
import extrue.springframework.librarywebapp.repositories.BookRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class BookRestController {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public BookRestController(BookRepository bookRepository, AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @GetMapping("/savebook")
    public void saveBook(@RequestParam(name = "title") String title, @RequestParam(name = "isbn") String isbn) {
        Book book = new Book(title, isbn);
        Optional<Author> defaultAuthorResult = authorRepository.findById(1l);
        if (defaultAuthorResult.isPresent()) {
            book.getAuthors().add(defaultAuthorResult.get());
        }
        bookRepository.save(book);
    }


}
