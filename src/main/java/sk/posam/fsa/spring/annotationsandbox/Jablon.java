package sk.posam.fsa.spring.annotationsandbox;

public class Jablon implements Strom{
    @Override
    public int getVynosZaRok() {
        return 230;
    }

    @Override
    public String getName() {
        return getClass().getName();
    }

    @Override
    public String toString() {
        return getName();
    }
}
