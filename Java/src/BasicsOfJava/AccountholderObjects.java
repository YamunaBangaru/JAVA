package BasicsOfJava;

import BasicsOfJava.Account;

public class AccountholderObjects {
    public static void main(String args[])
    {
        Account tom=new Account();
        Account sarah=new Account();
        Account subash=new Account();

        tom.Firstname="Bangaru";
        tom.Lastname="Tom";
        tom.age=24;
        tom.accountbalance=20000;
        tom.test();
        System.out.println("tom eligiblity"+tom.eligibiltyofcc);

        sarah.Firstname="sarah";
        sarah.Lastname="sarah";
        sarah.age=26;
        sarah.accountbalance=30000;
        sarah.test();
        System.out.println("sarah eligiblity"+sarah.eligibiltyofcc);

        subash.Firstname="subash";
        subash.Lastname="subash";
        subash.age=4;
        subash.accountbalance=10000;
        subash.test();
        System.out.println("subash eligiblity"+subash.eligibiltyofcc);
    }
}
