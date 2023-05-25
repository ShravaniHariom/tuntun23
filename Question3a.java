import java.util.Scanner;

public class Question3a {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String str;
        System.out.print("Enter Your String: ");
        str=sc.nextLine();
        char[] strarr;
        strarr=str.toCharArray();
        String rev="";

        //Through Character Array//
        System.out.print("Reversed String 1 is : ");
        for (int i = strarr.length-1; i >=0 ; i--) {
            System.out.print(strarr[i]);
        }

        // Normal Method//
        for (int i = 0; i < str.length(); i++) {
            rev=str.charAt(i)+rev;
        }
        System.out.println(" \n Reversed String 2 is : "+rev);

        //Through String Builder//
        StringBuilder reverse =new StringBuilder();
        reverse.append(str);
        reverse.reverse();
        System.out.println("Reversed String 3 is : "+reverse);

    }
}
