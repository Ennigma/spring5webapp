package guru.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import guru.springframework.spring5webapp.model.Author;

/* eserbaniuc created on 01/27/2020 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}

