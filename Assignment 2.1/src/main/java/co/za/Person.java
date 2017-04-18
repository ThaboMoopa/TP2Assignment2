package co.za;

/**
 * Created by thabomoopa on 2017/03/17.
 */
public class Person {

    private String name;

    private int num1;
    private int num2;
    private int amount;

    private float code;

    private double total;
    private double mark1;
    private double mark2;

    private boolean registered;

    public Person()
    {
        this.name = name;
        this.total = total;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.registered = registered;
        this.num1 = num1;
        this.num2 = num2;
        this.code = code;
        this.amount = amount;
    }

    public Person(String fName, double mTotal, double sMark1, double sMark2, boolean sRegistered, int sNum1, int sNum2, float sCode, int sAmount){
        this.name = fName;
        this.total = mTotal;
        this.mark1 = sMark1;
        this.mark2 = sMark2;
        this.registered = sRegistered;
        this.num1 = sNum1;
        this.num2 = sNum2;
        this.code = sCode;
        this.amount = sAmount;
    }

    public String getName()
    {return name; }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCode(float code)
    {
        this.code = code;
    }
    public float getCode()
    {
        return code;
    }

    public void setTotal(double total)
    {
        total = mark1 + mark2;
    }
    public double getTotal()
    {
        return total;
    }

    public void setMark1(float mark1){this.mark1 = mark1; }
    public void setMark2(float mark2){this.mark2 = mark2; }


    public double getMark1() {return mark1;}
    public double getMark2(){return mark2;}


    public void setNum1(int num1){this.num1 = num1;}
    public void setNum2(int num2){this.num2 = num2;}
    public int getNum1()
    {
        return num1;
    }
    public int getNum2()
    {
        return num2;
    }

    /*public void setAmount(int amount)
    {
        this.amount = amount
    }*/
    public  int getAmount()
    {
        return num1 + num2;
    }


    public boolean getRegistered(){return registered;};

    public void setRegistered(boolean registered)
    {
        this.registered = registered;
    }
}
