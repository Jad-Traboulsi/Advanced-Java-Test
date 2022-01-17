package fr.epita.tests.jad;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfigs.class})
public class TestSPR2 {
    @Inject
    @Named("myFirstBean")
    String st;

    @Test
    public void out(){
        System.out.println(st);
    }


}