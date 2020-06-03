package extrue.springframework.librarywebapp.bootstrap;

import extrue.springframework.librarywebapp.domain.Author;
import extrue.springframework.librarywebapp.domain.Book;
import extrue.springframework.librarywebapp.repositories.AuthorRepository;
import extrue.springframework.librarywebapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) {
        Author timur = new Author("Тимур", "Smith");
        Book book1 = new Book("Приключения кокерспаниэля", "4866546");

        timur.getBooks().add(book1);
        book1.getAuthors().add(timur);

        /*authorRepository.save(timur);
        bookRepository.save(book1);*/
    }
}
