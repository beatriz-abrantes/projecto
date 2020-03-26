
package projeto.helloworld ;

import projeto.helloworld.App;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
 
// TODO: Auto-generated Javadoc
/** 
 * Unit test for simple App.
 */ 
public class AppTest 
    extends TestCase
{
    
    /**
     * Create the test case.
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * Suite.
     *
     * @return the suite of tests being tested
     */
    public static Test suite() 
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-).
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    /**
     * Test.
     */
    @org.junit.Test
    public void test() {
    	App a = new App();
    	a.setNumber(1);
    	assertEquals(1, a.getNumber());
    }
    
    /**
     * Test 1.
     */
    @org.junit.Test
    public void test1() {
    	App a = new App();
    	int number = 5;
    	assertTrue(a.impar(number));
    }
    
    /**
     * Test 2.
     */
    @org.junit.Test
    public void test2() {
    	App a = new App();
    	a.change_number();
    	int number = 2;
    	assertEquals(2, a.getNumber());
    }
    
    /**
     * Test 3.
     */
    @org.junit.Test
    public void test3() {
    	App a = new App();
    	int number = 4;
    	assertFalse(a.impar(number));
    }
    
    @org.junit.Test
	public void testMain() {
		App.main(null);
	}

}
