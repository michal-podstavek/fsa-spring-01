package sk.posam.fsa.spring.application;

import sk.posam.fsa.spring.domain.Actor;
import sk.posam.fsa.spring.domain.Film;
import sk.posam.fsa.spring.domain.FilmArchiveService;
import sk.posam.fsa.spring.domain.repositories.ActorRepository;
import sk.posam.fsa.spring.domain.repositories.FilmRepository;

public class FilmArchiveServiceImpl implements FilmArchiveService {

    private ActorRepository actorRepository;
    private FilmRepository filmRepository;

    public FilmArchiveServiceImpl(ActorRepository actorRepository, FilmRepository filmRepository) {
        this.actorRepository = actorRepository;
        this.filmRepository = filmRepository;
    }

    @Override
    public boolean hralHerecVoFilme(long actorId, long filmId) {
        Actor actor = actorRepository.read(actorId);
        Film film = filmRepository.read(filmId);
        return film.getActors().contains(actor);
    }

    public ActorRepository getActorRepository() {
        return actorRepository;
    }

    public void setActorRepository(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    public FilmRepository getFilmRepository() {
        return filmRepository;
    }

    public void setFilmRepository(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
}
