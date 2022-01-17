package fr.epita.tests.jad;


import fr.epita.datamodel.Patient;
import fr.epita.services.dao.PatientDAO;
import jdk.jfr.Name;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfigs.class})
public class TestJPA3 {
    @Inject
    @Name("patientDAO")
    PatientDAO patientDAO;

    @Inject
    @Name("patient")
    Patient me;

    @Test
    public void daoTest(){
        patientDAO.insert(me);
        properDisplay(patientDAO.search(me));
        me.setPat_firstname("Potato");
        patientDAO.update(me);
        properDisplay(patientDAO.search(me));
        patientDAO.delete(me);
        properDisplay(patientDAO.search(me));


    }
    public void properDisplay(List<Patient> f){
        for (Patient g:
             f) {
            System.out.println(g.toString());
        }
    }

}
