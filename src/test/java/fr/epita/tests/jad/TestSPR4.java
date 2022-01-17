package fr.epita.tests.jad;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.inject.Named;
import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { TestConfigs.class})
public class TestSPR4 {
    @Inject
    @Named("mainDS")
    DataSource ds;

    @Test
    public void exists(){
        Assert.assertNotNull(ds);
    }
}
