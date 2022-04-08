package sk.posam.fsa.spring.domain.repositories;

import sk.posam.fsa.spring.domain.Film;

public interface FilmRepository {
    Film read(long id);
}
