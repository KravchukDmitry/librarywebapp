package extrue.springframework.librarywebapp.repositories;

import extrue.springframework.librarywebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
