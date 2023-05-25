import java.util.Scanner;

abstract class Marks{
abstract double getpercantage();

}

class A extends Marks{

   public double engmarks;
   public double mathmarks;
   public double scimarks;

   public double total;



    public A(double engmarks , double mathmarks , double scimarks){
       this.engmarks=engmarks;
       this.mathmarks=mathmarks;
       this.scimarks=scimarks;
       this.total=this.engmarks+this.mathmarks+this.scimarks;
   }


    @Override
     double getpercantage() {
       return (this.total/300)*100;
    }
}

class B extends  Marks{
    public double engmarks;
    public double mathmarks;
    public double scimarks;
    public double codingmarks;
    public double total;

    public B(double engmarks , double mathmarks , double scimarks,double codingmarks){
        this.engmarks=engmarks;
        this.mathmarks=mathmarks;
        this.scimarks=scimarks;
        this.codingmarks=codingmarks;
        this.total=this.engmarks+this.mathmarks+this.scimarks+this.codingmarks;
    }

    @Override
    double getpercantage() {

        return (total/400)*100;

    }
}


public class Question5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double engmarks;
        System.out.println("Enter English Marks : ");
        engmarks=sc.nextDouble();

        double mathmarks;
        System.out.println("Enter Maths Marks : ");
        mathmarks=sc.nextDouble();

        double scimarks;
        System.out.println("Enter Science Marks : ");
        scimarks=sc.nextDouble();

        double codingmarks;
        System.out.println("Enter Coding Marks : ");
        codingmarks=sc.nextDouble();

         A a= new A(engmarks,mathmarks,scimarks);
        System.out.println("Percentage of Student A is : "+a.getpercantage());

        B b= new B(engmarks,mathmarks,scimarks,codingmarks);
        System.out.println("Percentage of Student B is : "+b.getpercantage());


    }
}
