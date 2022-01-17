package fr.epita.tests.jad;

import fr.epita.datamodel.Patient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.inject.Named;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfigs.class})
public class TestSPR3 {
    @Inject
    @Named("patient")
    Patient patient;

    @Test
    public void display(){
        System.out.println(patient.toString());
    }
}
