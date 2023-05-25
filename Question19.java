import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

interface Account{
    void set(String name,int accountnumber , int balance);


}

interface PersonalPerson{

    void store();
    void disp();


}

class Custmor implements Account,PersonalPerson{

    public String name;
    public int accountnumber;

    int Searchkey;
    public int balance;

    public String custid="90Balu@123";

    ArrayList<String> namelist=new ArrayList<String>(90);
    ArrayList<Integer> Accountlist=new ArrayList<Integer>(90);
    ArrayList<Integer> balancelist=new ArrayList<Integer>(90);
    ArrayList<String> custid1=new ArrayList<String>(90);


    public void set(String name,int accountnumber , int balance){
        this.accountnumber=accountnumber;
        this.name=name;
        this.balance=balance;
        this.custid=custid.concat(name);
        System.out.println("Your Custmor Id is : "+custid);
    }

    public void store(){
        namelist.add(name);
        Accountlist.add(accountnumber);
        balancelist.add(balance);
        custid1.add(custid);
    }

    public void disp(){
        System.out.println("Enter Customer number : ");
        Scanner sc= new Scanner(System.in);
        Searchkey=sc.nextInt();
        System.out.println("Custmor Details are as Follows" +" \n Name is : "
                 +namelist.get(Searchkey)+
                 "\t \tAccount No is : "+Accountlist.get(Searchkey)+
                "\t \t  Balance is : "+balancelist.get(Searchkey));
    }

}


public class Question19 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int [] Accountnumber=new int[90];
        String [] name=new String[90];
        int [] Balance=new int[90];
        String[] cutid=new String[90];
        int number;
        int choice;

        System.out.println("Enter no. of Customers : ");
        number=sc.nextInt();

        Custmor newc=new Custmor();


        for (int i = 0; i < number; i++) {
            System.out.println("Enter Your Name : ");
            name[i]=sc.next();

            System.out.println("Enter your Accout no : ");
            Accountnumber[i]=sc.nextInt();

            System.out.println("Enter Your Balance : ");
            Balance[i]=sc.nextInt();

            newc.set(name[i],Accountnumber[i],Balance[i]);
            newc.store();
        }

        while (true){

            System.out.println("Enter Custmor number : ");
            choice=sc.nextInt();

            switch (choice){

                case 1:
                    newc.disp();
                    break;

                default:
                    System.out.println("Enter Valid Choice");
                    break;
            }

        }


    }
}
