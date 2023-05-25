import java.util.Scanner;

class exceptionCustom extends Exception{

   public  exceptionCustom(String str1){
       super(str1);
       System.out.println("Enter Positive Numbers Only");
       System.exit(0);
   }

}


class mycalculator{

    public long n;
    public long p;

    public long result=1;

    public long power1(long n,long p) throws exceptionCustom {
        this.n=n;
        this.p=p;
        try{
            if(n<0 || p<0){
                throw new exceptionCustom("Number Should be Positive");
            }
        }catch (exceptionCustom e){
            System.out.println(e);
        }

        for (int i = 1; i <=p; i++) {
            result *= n;
        }
        return result;
    }


}


public class Question7 {

    public static void main(String[] args) throws exceptionCustom {

        long number;
        long power;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Number : ");
        number=sc.nextInt();

        System.out.println("Enter Power : ");
        power=sc.nextInt();

        mycalculator m= new mycalculator();
        System.out.println("Result is : "+m.power1(number,power));


    }
}
