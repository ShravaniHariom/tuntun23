import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IllegalFormatException;
import java.util.Scanner;

public class Question8 {

    public static void main(String[] args)  {
        String[] name=new String[90];
        char[] namechar;
        int[] PhoneNo=new int[90];
        int number;
        String searchqueryname;

        HashMap<String,Integer> phonebook= new HashMap<String,Integer>(90);

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter no of Entries : ");
        number=sc.nextInt();

        for (int i = 0; i <number; i++) {

            System.out.println("Enter Name Of Person : ");
            name[i]=sc.next();

            namechar=name[i].toCharArray();

            if (!Character.isLowerCase( namechar[i] )){
                System.out.println("Enter in Small Case");
                System.exit(0);
            }

            System.out.println("Enter Phone Number of Person : ");
            PhoneNo[i]=sc.nextInt();

            phonebook.put(name[i],PhoneNo[i]);

        }

        System.out.println("Hashmap is : "+phonebook);

        System.out.println("Enter name to Search : ");
        searchqueryname=sc.next();

        if (phonebook.containsKey(searchqueryname)) {
            System.out.println("Phone Number is  : " + phonebook.get(searchqueryname));
        }
    }

}
