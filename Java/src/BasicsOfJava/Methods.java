package BasicsOfJava;

public class Methods {
   static int gender()
    {
        System.out.println("female");
        return 0;
    }
    public static void main(String args[])
    {
       for(int i=0;i<3;i++)
       {
           System.out.println(gender());
       }
    }
}
