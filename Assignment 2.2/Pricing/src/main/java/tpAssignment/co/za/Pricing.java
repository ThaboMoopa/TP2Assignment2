package tpAssignment.co.za;

/**
 * Created by thabomoopa on 2017/03/18.
 */
public class Pricing {
    private double payment;
    private double pay1;
    private double pay2;

    public Pricing()
    {
        this.payment = payment;
        this.pay1 = pay1;
        this.pay2 = pay2;
    }
    public Pricing ( double fPay, double sPay)
    {

        this.pay1 = fPay;
        this.pay2 = sPay;
    }
    public double getPayment()
    {
        return payment = pay1 + pay2;
    }
    public double getPay1()
    {
        return pay1;
    }
    public void setPay1(double pay1)
    {
        this.pay1 = pay1;
    }
    public double getPay2()
    {
        return pay2;
    }
    public void setPay2(double pay2)
    {
        this.pay2 = pay2;
    }

}
