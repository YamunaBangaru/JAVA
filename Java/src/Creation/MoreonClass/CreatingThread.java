package Creation.MoreonClass;

public class CreatingThread extends  Thread {

public void run()
{
    System.out.println("Print run");
}
public static void main(String args[])
{
    CreatingThread c=new CreatingThread();
    //c.start();
c.run();
}}
