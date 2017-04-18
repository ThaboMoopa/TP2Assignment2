package tpAssignment.co.za;

/**
 * Created by thabomoopa on 2017/03/18.
 */
public class PersonMain {

    public static void main (String [] args)
    {
        Person p = new Person("Thabo", "Moopa");
        University u = new University("CPUT");
        City c = new City("Cape Town");
        Pricing pri = new Pricing(5600.00,9000.76);

        System.out.print("Student Name: " + p.getName());
        System.out.print("Student Surname: " + p.getName());
        System.out.print("University: " + u.getName());
        System.out.print("City Registered: " + c.getName());
        System.out.print("Amount Paid: " + pri.getPayment());

    }
}
