package tpAssignment.co.za;

import junit.framework.TestCase;
import junit.framework.TestResult;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/03/18.
 */
public class PricingTest extends TestCase{

Pricing pri = new Pricing();

@Test
    public void testPricing()
{
    pri.setPay1(987.87);
    pri.setPay2(635.74);
    assertEquals(100, pri.getPayment());
}
}
