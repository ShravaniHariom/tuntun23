import java.util.Scanner;

public class Question11a {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int number;
        System.out.println("Enter your Number : ");
        number=sc.nextInt();

        System.out.println("Multiplecation Table: ");
        for (int i = 0; i <=10; i++) {
            System.out.println(number+"X"+i+"="+(number*i));
        }


    }
}
