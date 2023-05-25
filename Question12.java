import java.util.Scanner;
public class Question12 {
    public static void main(String[] args) {

            int i,k;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
            int n= sc.nextInt();
            for(i=1;i<=n;i++)
            {
                for(k=1;k<=i*2-1;k++){
                    System.out.print("*");
                }
                System.out.println("");
            }
            for(i=n-1;i>=1;i--)
            {
                for(k=i*2-1;k>=1;k--){
                    System.out.print("*");
                }
                System.out.println("");
            }

        }


    }
