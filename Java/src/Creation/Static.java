package Creation;

public class Static {
    public  int COUNT=0;
    Static()
    {
        COUNT++;
    }

public static void main(String args[])
{
    Static sc=new Static();
    Static sc1=new Static();
    System.out.println( sc.COUNT);
}
}
