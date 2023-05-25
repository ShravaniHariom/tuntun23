import java.util.Scanner;

public class Question3b {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.print("Enter Your String: ");
        str=sc.nextLine();
        String rev="";

        for (int i = 0; i < str.length(); i++) {
            rev=str.charAt(i)+rev;
        }
        System.out.println("\nReversed String is : "+rev);

        if (rev.equals(str)){
            System.out.println("\n The String is palindrome");
        }else {
            System.out.println("\n String is not palindrome");
        }

    }
}
