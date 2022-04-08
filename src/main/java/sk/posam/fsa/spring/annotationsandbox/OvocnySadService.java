package sk.posam.fsa.spring.annotationsandbox;

import org.springframework.stereotype.Service;

@Service
public class OvocnySadService {

    private OvocnySad ovocnySad;

    public OvocnySadService() {
    }

    public OvocnySadService(OvocnySad ovocnySad) {
        this.ovocnySad = ovocnySad;
    }

    public int getVynosnost() {
        return ovocnySad.getStromy()
                .stream()
                .mapToInt(Strom::getVynosZaRok)
                .sum();
    }

    public OvocnySad getOvocnySad() {
        return ovocnySad;
    }

    public void setOvocnySad(OvocnySad ovocnySad) {
        this.ovocnySad = ovocnySad;
    }

    @Override
    public String toString() {
        return "OvocnySadService{" +
                "ovocnySad=" + ovocnySad +
                '}';
    }
}
