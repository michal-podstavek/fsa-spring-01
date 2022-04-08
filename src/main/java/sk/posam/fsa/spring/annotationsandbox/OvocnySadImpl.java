package sk.posam.fsa.spring.annotationsandbox;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Component
public class OvocnySadImpl implements OvocnySad {

    @Value("${ovocnySad.kapacita}")
    private int kapacita;

    private Set<Strom> stromy=new HashSet<>();

    @Override
    public int getKapacita() {
        return kapacita;
    }

    @Override
    public void addStrom(Strom strom) {
        stromy.add(strom);
    }

    @Override
    public Collection<Strom> getStromy() {
        return stromy;
    }

    public void setKapacita(int kapacita) {
        this.kapacita = kapacita;
    }

    public void setStromy(Set<Strom> stromy) {
        this.stromy = stromy;
    }

    @Override
    public String toString() {
        return "OvocnySadImpl{" +
                "kapacita=" + kapacita +
                ", stromy=" + stromy +
                '}';
    }
}
