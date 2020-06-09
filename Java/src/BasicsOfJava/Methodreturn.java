package BasicsOfJava;

public class Methodreturn {
    static int sum(int val1, int val2)
    {
        return val1 + val2;
    }
    // returns an int value 5
    static int returnFive() {
        return 5;
    }

    // has a parameter
    static void sayHelloTo(String name) {
        System.out.println("Hello " + name);
    }

    // simply prints"Hello World!"
    static void sayHello() {
        System.out.println("Hello World!");
    }

    public static void main(String args[])
    {
        int x=sum(2,5);
        System.out.println(x);
       int y= returnFive();
        System.out.println(y);
        sayHelloTo("yamuna");
        sayHello();
    }

}

