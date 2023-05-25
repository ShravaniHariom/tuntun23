import java.util.Scanner;

class Person{
    public String Name;
    public int Age;

    public Person(String Name,int Age){
        this.Name=Name;
        this.Age=Age;
    }
}

class Employee extends Person{
    public String Expertize;
    public int Salary;

    public Employee(String Name , int Age,String Expertize,int Salary){
        super(Name,Age);
        this.Salary=Salary;
        this.Expertize=Expertize;

        if(this.Salary>5000){
            System.out.println("Name of Employees: "+super.Name);
        }


    }
}



public class Question18{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String[] Name=new String[90];
        int[] Age=new int[90];
        String[] Expertize=new String[90];
        int[] Salary=new int[90];

        int[] e= {1,2,3,4,5};

        int number;
        System.out.println("Enter Number");
        number=sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println("Enter Name: ");
            Name[i]=sc.next();

            System.out.println("Enter Age : ");
            Age[i]=sc.nextInt();

            System.out.println("Enter Expertize : ");
            Expertize[i]=sc.next();

            System.out.println("Enter Salary : ");
            Salary[i]=sc.nextInt();
        }

        for (int i=0;i<number;i++){
            Employee e1=new Employee(Name[i],Age[i],Expertize[i],Salary[i]);
        }


    }
}

