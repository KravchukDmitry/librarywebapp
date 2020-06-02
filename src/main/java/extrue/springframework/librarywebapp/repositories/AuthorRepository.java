package extrue.springframework.librarywebapp.repositories;

import extrue.springframework.librarywebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
