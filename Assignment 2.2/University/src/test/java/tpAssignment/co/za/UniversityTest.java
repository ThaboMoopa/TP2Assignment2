package tpAssignment.co.za;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/03/18.
 */
public class UniversityTest extends TestCase {

    University u = new University();

    @Test
    public void testUniversityName()
    {
        u.setName("CPUT");
        assertEquals("CPUT", u.getName());
    }
}
