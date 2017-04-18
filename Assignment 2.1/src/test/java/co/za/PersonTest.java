package co.za;

import junit.framework.Test;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Ignore;


/**
 * Created by thabomoopa on 2017/03/17.
 */
public class PersonTest extends TestCase{
    Person p = new Person();

    //PASSING TESTS

    //i.Test for Floating Point
    @org.junit.Test
    public void testFloatingPointPass()
    {
        p.setCode(30f);
        assertEquals(30f, p.getCode());
    }

    //ii. Test for integers
    @org.junit.Test
    public void testIntergerPass()
    {
        p.setNum1(65);
        p.setNum2(75);
        p.getAmount();
        assertEquals(140, p.getAmount());

    }

    //iii. Test Object Equality - two distinct objects can be used to interchangable. They often have the same id.
    @org.junit.Test
    public void testObjectEqualityPass()
    {
       Person p1 = new Person("Thabo",65,30,35,true,3,4,30f,6);
       Person p2 = new Person("Thabo",65,30,35,true,3,4,30f,6);
       assertEquals(p1, p1);
    }

    //iv. Test Object Identity - a variable holds the same instance as another
    @org.junit.Test
    public void testObjectIdentityPass()
    {

        Person p1 = new Person("Thabo",65,30,35,true,3,4,30f,6);
        Person p2 = p1;
        assertEquals(p1, p2);
    }

    //v Test for Truth (Pass)
    @org.junit.Test
    public void testTruthPass()
    {

        p.setRegistered(true);
        assertTrue(p.getRegistered());
    }

    //vi Test for Fail (Pass)
    @org.junit.Test
    public void testFalsePass()
    {
        p.setRegistered(false);
        assertFalse(p.getRegistered());
    }

    //vii Test for Nullness
    @org.junit.Test
    public void testNullnessPass()
    {
        p.setName(null);
        assertNull(p.getName());
    }

    //viii Test for NonNullness
    @org.junit.Test
    public void testNonNullnessPass()
    {
        //Person p1 = new Person();
        p.setName("Thabo");
        assertNotNull(p.getName());
    }

    //ix Test for Failing Test
    @org.junit.Test
    public void testFailPass()
    {
        try{
            fail("Exception not thrown");

        }
        catch(Exception e)
        {
            p.setMark1(67);
            p.setMark2(20);
            assertEquals(87, p.getTotal());
        }

    }

    //x. Test for Exceptions 11. Timeouts
    @org.junit.Test
    public void testTimeOut() throws InterruptedException {
        Thread.sleep(11);

    }

    //xi. Test for Disabling test
    @Ignore @org.junit.Test
    public void testDisableTest()
    {
        p.setNum1(93);
        p.setNum2(20);
        assertEquals(113,p.getAmount());
    }

    //xii Test for Arrays Content
    @org.junit.Test
    public void testArrayContent()
    {
        int array1[] = {1,2,3};
        int array2[] = array1;
        assertEquals(array1,array2);
    }
}
