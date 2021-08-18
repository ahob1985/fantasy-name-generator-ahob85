

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class FantasyNameGeneratorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class FantasyNameGeneratorTest
{
    /**
     * Default constructor for test class FantasyNameGeneratorTest
     */
    public FantasyNameGeneratorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    @Test
    public void getNewFirstNameTest() {
        assertEquals("Aarho", FantasyNameGenerator.getNewFirstName("Aaron", "Hobson"));
        assertEquals("Weili", FantasyNameGenerator.getNewFirstName("Wei", "Li"));
        assertEquals("Robro", FantasyNameGenerator.getNewFirstName("Robert", "Rodriguez"));
        assertEquals("Quita", FantasyNameGenerator.getNewFirstName("Quintin", "Tarantino"));
        assertEquals("Denwa", FantasyNameGenerator.getNewFirstName("Denzel", "Washington"));
        assertEquals("Hodto", FantasyNameGenerator.getNewFirstName("Hodari", "Toure"));
        assertEquals("Malx", FantasyNameGenerator.getNewFirstName("Malcolm", "X"));
        assertEquals("Xx", FantasyNameGenerator.getNewFirstName("X", "X"));
    }
    
    @Test
    public void getNewLastNameTest() {
        assertEquals("Aldet", FantasyNameGenerator.getNewLastName("Alcorn", "Detroit"));
        assertEquals("Mojac", FantasyNameGenerator.getNewLastName("Moore", "Jackson"));
        assertEquals("Jamoo", FantasyNameGenerator.getNewLastName("Jackson", "Moore"));
        assertEquals("Brbro", FantasyNameGenerator.getNewLastName("Brown", "Brown"));
        assertEquals("Xx", FantasyNameGenerator.getNewLastName("X", "X"));
    }
    
    @Test
    public void getTitleTest() {
        assertEquals("Noscorolla", FantasyNameGenerator.getTitle("Hobson", "Corolla"));
        assertEquals("Zenlexus", FantasyNameGenerator.getTitle("Munez", "Lexus"));
        assertEquals("Amataurus", FantasyNameGenerator.getTitle("Obama", "Taurus"));
        assertEquals("Goddammit", FantasyNameGenerator.getTitle("Dog", "Dammit"));
        assertEquals("Xx", FantasyNameGenerator.getTitle("X", "X"));
    }
    
    @Test
    public void getHonorificTest() {
        assertEquals("Noscorolla of Estates", FantasyNameGenerator.getHonorific("Hobson", "Corolla", "Estates"));
        assertEquals("Zenlexus of Ramona", FantasyNameGenerator.getHonorific("Munez", "Lexus", "Ramona"));
        assertEquals("Amataurus of Bancroft", FantasyNameGenerator.getHonorific("Obama", "Taurus", "Bancroft"));
        assertEquals("Goddammit of 42nd Street", FantasyNameGenerator.getHonorific("Dog", "Dammit", "42nd Street"));
        assertEquals("Xx of X", FantasyNameGenerator.getHonorific("X", "X", "X"));
    }
}
