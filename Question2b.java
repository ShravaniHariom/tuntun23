import java.util.Scanner;

public class Question2b {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String strnew;
        char[] strchararray;
        char e='e';

        System.out.print("Enter your String : ");
        strnew=sc.nextLine();

        strchararray=strnew.toCharArray();

        for (int i = 0; i < strnew.length(); i++) {
            if (strchararray[i]==e){
                System.out.println(" String Contains Letter 'e' ");
            }
        }

        System.out.println("No matching 'e' found");


    }
}
