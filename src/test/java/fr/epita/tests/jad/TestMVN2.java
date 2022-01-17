package fr.epita.tests.jad;

import fr.epita.datamodel.Patient;
import fr.epita.utils.PatientReader;

import java.io.IOException;
import java.text.ParseException;

public class TestMVN2 {
    public static void main(String[] args) throws IOException, ParseException {
        PatientReader reader = new PatientReader();
        for (Patient p:
             reader.readAll()) {
            System.out.println(p.toString());

        }
    }

}
