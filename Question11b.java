import java.util.Scanner;

public class Question11b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        boolean flag=false;

        System.out.println("Enter your Number : ");
        number=sc.nextInt();

        for (int i = 2; i <=number/2; i++) {

            if(number%i==0){
                flag=true;
            }else{
                flag=false;
            }

        }

        if (!flag){
            System.out.println("Number is Prime Number");
        }else {
            System.out.println("Number is Non-prime");
        }


    }

}
