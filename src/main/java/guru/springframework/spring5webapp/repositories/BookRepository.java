package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Book;

/* eserbaniuc created on 01/27/2020 */
public interface BookRepository extends CrudRepository<Book, Long> {

}
