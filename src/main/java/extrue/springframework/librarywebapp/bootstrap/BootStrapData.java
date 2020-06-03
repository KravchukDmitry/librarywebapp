package extrue.springframework.librarywebapp.bootstrap;

import extrue.springframework.librarywebapp.domain.Author;
import extrue.springframework.librarywebapp.domain.Book;
import extrue.springframework.librarywebapp.repositories.AuthorRepository;
import extrue.springframework.librarywebapp.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
@Scope("session")
@Qualifier("test1")
public class BootStrapData implements TestCustom {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void run(String... args) {
        Author timur = new Author("Тимур", "Smith");
        Book book1 = new Book("Приключения кокерспаниэля", "4866546");

        timur.getBooks().add(book1);
        book1.getAuthors().add(timur);
    }

    @Override
    public void doSomeThing() {

    }
}
