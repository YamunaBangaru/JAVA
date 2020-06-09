package BasicsOfJava;

public class IfElse {

    public static void main(String args[]) {
    //Operators and If else statement

        int a = 10;
        int b = 20;

        if (a == b) {
            System.out.println("a and b are equal");
        } else {
            System.out.println("a and b are not equal");
        }



// using greater than and operater to check the statement
    int c=12;
    int d=45;
    int j=123;

    if(c>d & c>j)
    {
        System.out.println("c is greater ");
    }
    else if(d>j)
    {
        System.out.println("d is greater");
        }
        else {
        System.out.println("j is greater");
    }

       // with 2 variables greater than testing using > operater
        int a1=134445;
        int b1=34324234;
        if(a1>b1)
        {
            System.out.println("a1 is greater than b1");
        }
        System.out.println("b1 is greatar than a1");
}}