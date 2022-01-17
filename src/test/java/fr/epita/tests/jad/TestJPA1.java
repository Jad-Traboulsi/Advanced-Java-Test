package fr.epita.tests.jad;

import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.inject.Named;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfigs.class})
public class TestJPA1 {
    @Inject
    @Named("session")
    SessionFactory session;

    @Test
    public void checkSession(){
        Assert.assertNotNull(session);
    }
}
