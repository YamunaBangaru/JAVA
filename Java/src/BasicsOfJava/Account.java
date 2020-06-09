package BasicsOfJava;

public class Account {
    String Firstname;
    String  Lastname;
    int age;
    float accountbalance;
    boolean eligibiltyofcc;

    public void test()
    {
        if(age>25 && accountbalance>=20000)
        {
            eligibiltyofcc=true;
        }

    }
}
