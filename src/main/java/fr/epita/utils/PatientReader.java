package fr.epita.utils;

import fr.epita.datamodel.Patient;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class PatientReader{

    public List<Patient> readAll() throws IOException, ParseException {
        List<String> listOfLines = Files.readAllLines(new File("src/main/resources/patients.csv").toPath());
        List<Patient> patients = new ArrayList<>();
        listOfLines.remove(0);
        for (String line : listOfLines) {

            String[] l = line.split(";");
            try {

                l[0] = l[0].replace("\"","");
                l[4] = l[4].replace("\"","");
                patients.add(new Patient(Long.parseLong(l[0]),l[1],l[2],l[3],l[4],Integer.parseInt(l[5]), l[6]));
            } catch (NumberFormatException nfe) {
                nfe.printStackTrace();
            }


        }
        return patients;
    }
}