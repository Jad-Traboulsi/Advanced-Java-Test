package fr.epita.tests.jad;

import fr.epita.datamodel.Patient;
import fr.epita.utils.PatientReader;
import org.junit.*;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public class TestJUN3 {

    @BeforeClass
    public static void inBeforeClass() {
        System.out.println("I am in BeforeClass");
    }
    @Before
    public void inBefore() {
        System.out.println("I am in Before");
    }


    @Test
    public void testing() throws IOException, ParseException {
        // given
        PatientReader reader = new PatientReader();
        // when
        List<Patient> patients = reader.readAll();

        Assert.assertNotNull(patients);

        // then

        for(Patient patient: patients)
            System.out.println(patient);

    }

    @After
    public void inAfter() {
        System.out.println("I am in After");
    }

    @AfterClass
    public static void inAfterClass() {
        System.out.println("I am in AfterClass");
    }
}
