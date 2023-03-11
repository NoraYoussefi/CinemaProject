package org.sid.cinema.dao;

import org.sid.cinema.entities.Cinema;
import org.sid.cinema.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource     // it will automatically create endpoints as appropriate based on the type of Repository that is being extended (i.e. CrudRepository/PagingAndSortingRepository/etc)
public interface FilmRepository extends JpaRepository<Film,Long> {
}
