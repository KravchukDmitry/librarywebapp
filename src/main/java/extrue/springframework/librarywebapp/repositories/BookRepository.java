package extrue.springframework.librarywebapp.repositories;

import extrue.springframework.librarywebapp.domain.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends CrudRepository<Book, Long> {

    Iterable<Book> findByTitleStartingWith(String titlePart);

    @Query(value = "SELECT b FROM Book b WHERE b.id = :param")
    Book getBooks1(@Param("param") Long param);
}
