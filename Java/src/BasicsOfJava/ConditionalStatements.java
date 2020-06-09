package BasicsOfJava;

public class ConditionalStatements {
    public static void main(String args[])
    {
//        //if statement
//        if(condition)
//        {
//            Sop
//        }

        int x=28;
        int y=45;
        if(x>y)
        {
            System.out.println("x is greater");
        }
        System.out.println("y is greater");
    //if else statement
        if(x==y)
        {
            System.out.println("x and y are equal");
        }else {
            System.out.println("x and y are not equal");

            int age=25;
            if(age<=0)
            {
                System.out.println("Error");
            }else if(age<18)
            {
                System.out.println("Minor");
            }else if(age<100)
            {
                System.out.println("Welcome");
            }


        }

    }



}
