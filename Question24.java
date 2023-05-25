import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class AgeNotWithinTheRange extends Exception{
    public AgeNotWithinTheRange(String ster){
        super(ster);
    }
}

class NameNotValid extends Exception{
    public NameNotValid(String Str){
        super(Str);
    }
}



class Student456 {
    public int rollno;
    public String Name;
    public int age;
    public String course;

    public boolean specialchar=false;

    public Student456(int rollno,int age ,String course ,String Name){
        this.rollno=rollno;
        this.age=age;
        this.course=course;
        this.Name=Name;
    }

    void validate(){
        try{
            if (this.age<15 ||this.age>21){
                throw new AgeNotWithinTheRange("Age Must be within 15 and 21");
            }

            Pattern p =Pattern.compile("[$&+,:;=?@#|'<>.-^*()%!]");
            Matcher matcher =p.matcher(this.Name);
            specialchar= matcher.find();

            if (specialchar){
                try{
                    throw new NameNotValid("Name is not valid");
                }catch (NameNotValid n){
                    System.out.println(n);
                }
            }
        }catch (AgeNotWithinTheRange a){
            System.out.println(a);
        }
    }


}



public class Question24{

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String Name;
        System.out.println("Enter your name : ");
        Name=sc.next();


        String Course;
        System.out.println("Enter Your Course");
        Course=sc.next();

        int rollno;
        System.out.println("Enter Your Rollno: ");
        rollno=sc.nextInt();

        int age;
        System.out.println("Enter Your Age : ");
        age=sc.nextInt();


        Student456 s= new Student456(rollno,age,Course,Name);
        s.validate();


    }
}
