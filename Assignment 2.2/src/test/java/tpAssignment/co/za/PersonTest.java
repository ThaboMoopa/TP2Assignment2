package tpAssignment.co.za;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/03/18.
 */
public class PersonTest extends TestCase {
    Person p = new Person();



    @Test
    public void testName()
    {
        p.setName("John");
        assertEquals("John", p.getName());
    }
    @Test
    public void testSurname()
    {
        p.setName("Moopa");
        assertEquals("Moopa", p.getName());
    }

}
