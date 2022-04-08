package sk.posam.fsa.spring.annotationsandbox;

import java.util.Collection;

public interface OvocnySad {
    int getKapacita();

    void addStrom(Strom strom);

    Collection<Strom> getStromy();
}
