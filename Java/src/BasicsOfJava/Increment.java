package BasicsOfJava;

public class Increment {
    public static void main(String args[])
    {
        int x=10;
        int y=++x;
        System.out.println("Pre-increment value:" +y);
        System.out.println("Pre-increment value:" +x);


    int j=10;
    int k=j++;
        System.out.println("Post-increment value:" +j);
        System.out.println("Post-increment value:" +k);



   int a=10;
   int b=--a; //a=9 b=9
   System.out.println("pre-decrement:"+b);
   System.out.println("pre-decrement:"+a);

        int d=10;
        int e=d--; //e=10,d=9
        System.out.println("post-decrement:"+d);
        System.out.println("post-decrement:"+e);

    }
}
