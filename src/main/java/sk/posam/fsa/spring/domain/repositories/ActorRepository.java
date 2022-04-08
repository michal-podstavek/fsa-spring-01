package sk.posam.fsa.spring.domain.repositories;

import sk.posam.fsa.spring.domain.Actor;

public interface ActorRepository {
    Actor read(long id);
}
