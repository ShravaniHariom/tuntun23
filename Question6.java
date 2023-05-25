import java.util.Scanner;

class Arithmetic{

    public int resultsum;
    public int num1;
    public int num2;

    public Arithmetic(){
        System.out.println("Your Superclass is Arithemetic");
    }

    public int add(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    resultsum=this.num1+this.num2;
    return  resultsum;
    }

}

class Adder extends Arithmetic{

    public  Adder(){
        super();
    }
}


public class Question6 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Enter First Number : ");
        num1=sc.nextInt();

        System.out.println("Enter Second Number : ");
        num2=sc.nextInt();

        Adder a = new Adder();
        System.out.println("Addition of Two numbers is : "+a.add(num1,num2));
    }
}
