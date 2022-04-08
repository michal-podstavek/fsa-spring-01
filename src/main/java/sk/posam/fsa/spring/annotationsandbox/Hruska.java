package sk.posam.fsa.spring.annotationsandbox;

public class Hruska implements Strom{
    @Override
    public int getVynosZaRok() {
        return 100;
    }

    @Override
    public String getName() {
        return "Hruska";
    }

}
