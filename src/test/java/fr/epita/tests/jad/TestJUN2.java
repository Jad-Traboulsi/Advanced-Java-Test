package fr.epita.tests.jad;

import org.junit.*;

import java.io.IOException;
import java.text.ParseException;

public class TestJUN2 {


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
        TestMVN2 mvn = new TestMVN2();
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
