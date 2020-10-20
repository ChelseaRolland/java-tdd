import org.junit.Test;
import static org.junit.Assert.*;

public class MyFirstTest {
    @Test
    public void testIfCompanyNameIsEquals(){
        String expected = "Codeup";
        String actual = "Codeup";
        //Manual Method
        //expected.equalsIgnoreCase(actual);

        //JUnit Method --> Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testIfChangeIsCorrect() {
        Double price = 10.0;
        Double discount = 4.5;

        //Check to see if something works --> Best case scenario
        assertEquals(5.5, price - discount, 0);

        //Check an edge case scenario
        assertEquals(5.1, price - discount, 0.5);

        //Below is supposed to fail, so what you can do is set it up like the assertNotEquals
        //assertEquals(4.9, price - discount, 0.5);

        //Make sure everything fails like I'm expecting
        assertNotEquals(4.9, price - discount, 0.5);

        //Think/Check different cases, such as if someone was to give you null

        //Delta --> margin of error from the original from below and above the original
        //Such as delta = 0.5; this means if the original is 5.5, answers that are 5.0 - 6.0 will fit in our margin of error so it'll be correct; and anything outside of it will be incorrect since its outside of the margin of error

    }

    @Test
    public void testIfObjectsAreDifferent() {
        //Different object than sheep
        Object dog = new Object();
        //Different object than dog
        Object sheep = new Object();
        //Below creates a new variable with the same memory location as sheep
        Object clonnedSheep = sheep;

        //Making sure the memory address is the same
        //System.out.println("sheep = " + sheep);
        //System.out.println("clonnedSheep = " + clonnedSheep);

        assertNotSame(sheep, dog);
        assertSame(sheep, clonnedSheep);
    }

    @Test
    public void testIfArrayEquals() {
        char[] expected = {'J','u','n','i','t'};
        char[] actual = "Junit".toCharArray();
        //This checks to see if the arrays are the same
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testIfGreaterOrLesserThanWorks() {

        boolean learningTDD = true;

        assertTrue(learningTDD);
        assertTrue("5 is greater than 4", 5 > 4);
        assertFalse("5 is not greater than 6", 5 > 6);
    }

    @Test
    public void testIfInstanceIsNull() {
        //TDD: #1st Step
        //Do this 1st before you build an actual class
        //Think about happy path, then build up to it
        Device phone = new Device ();
        Device mac = null;
        assertNull(null);
        assertNotNull(phone);
    }

    @Test
    public void testIfDeviceNameIsPossible(){
        Device phone = new Device("iPhone12ProMax");
        assertEquals("iPhone12ProMax", phone.getPhoneName());


    }


}
