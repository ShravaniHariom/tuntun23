import java.util.Scanner;

class Vehicle{
    void move(){
        System.out.println("You are In Vehicles");
    }

}
class Helicopter extends Vehicle{
    @Override
    void move(){
        System.out.println("Helicopter Flies In Air");
    }

}

class Car extends Vehicle{

    @Override
    void move() {
        System.out.println("Car Drives on Road");
    }
}

class Train extends Vehicle{
    @Override
    void move(){
        System.out.println("Train Runs On Track ");
    }
}


public class Question4 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        while(true){

            int numchoice;
            System.out.println("Welcome To The Program");
            System.out.println("Enter 1 For Vehicle"+"\tEnter 2 For Exit");
            numchoice=sc.nextInt();

            switch (numchoice){

                case 1:
                    String vehiclechoice;
                    System.out.println("Enter Your Vehicle : ");
                    vehiclechoice=sc.next();

                    if (vehiclechoice.toLowerCase().equals("helicopter")){
                        Helicopter h= new Helicopter();
                        h.move();
                        break;
                    } else if (vehiclechoice.toLowerCase().equals("car")) {
                        Car c= new Car();
                        c.move();
                        break;
                    }else if (vehiclechoice.toLowerCase().equals("train")) {
                        Train t=new Train();
                        t.move();
                        break;
                    }else{
                        System.out.println("Enter Valid Choice ");
                        System.exit(0);
                    }

                    break;

                case 2:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter a valid Choice");

            }





        }



    }
}
