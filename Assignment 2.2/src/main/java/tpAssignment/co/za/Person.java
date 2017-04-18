package tpAssignment.co.za;

/**
 * Created by thabomoopa on 2017/03/18.
 */
public class Person {
    private String name;
    private String surname;

    public Person(String fName, String lSurname)
    {
        name = fName;
        surname = lSurname;
    }

    public Person()
    {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public String getSurname()
    {
        return surname;
    }

}
