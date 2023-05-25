import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student{
    public String Name;
    public int Grade;
    public String Coursedelete;
    ArrayList <String> Courses= new ArrayList<String>(90);

    public Student(String Name,int Grade){
        this.Name=Name;
        this.Grade=Grade;
    }

    public void addcourse(ArrayList courses){
        System.out.println("Course has been Added Successfully");
        Courses.addAll(courses);
    }

    public void addcourse(String c){
        System.out.println("Course has been Added Successfully");
        Courses.add(c);
    }

   public void  removecourse(String S){
        Courses.remove(S);
       System.out.println("Element removed Successfully");
   }

   public void detailsshow(){
       System.out.println("Your Details Are: ");
       System.out.println("Name is :"+this.Name+"\t Grade is : "+this.Grade);
       Iterator<String> ic = Courses.iterator();
       System.out.println("Cousers enrolled are : ");
       while(ic.hasNext()){
           System.out.println(ic.next());
       }
   }


}

public class Question21 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String Name;
        int grades;
        int courseno;
        String[] coursename=new String[90];

        System.out.println("Enter your Name : ");
        Name=sc.next();

        System.out.println("Enter No of courses: ");
        courseno=sc.nextInt();

        ArrayList<String> course=new ArrayList<String>(30);

        System.out.println("Enter Grades : ");
        grades=sc.nextInt();

        System.out.println("Enter Courses : ");
        for (int i = 0; i <courseno; i++) {
          coursename[i]=sc.next();
        }

        for (int i = 0; i <courseno; i++) {
            course.add(coursename[i]);
        }
        Student s= new Student(Name,grades);
        s.addcourse(course);
        System.out.println("Student Added Successfully");

        while(true){

            System.out.println(" 1.Adding Extra courses \t"+"\t 2.Removing courses \t "+"\t 3.Showing details"+"\t 4.Exit ");
            int choice;
            System.out.println("Enter Choice : ");
            choice=sc.nextInt();

            switch (choice){
                case 1:
                    String coursename2;
                    System.out.println("Enter extra course to add : ");
                    coursename2=sc.next();
                    course.add(coursename2);
                    s.addcourse(coursename2);
                    break;

                case 2:
                    String Coursedelete;
                    System.out.println("Enter Course To Remove : ");
                    Scanner Sc= new Scanner(System.in);
                    Coursedelete=Sc.next();
                    s.removecourse(Coursedelete);
                    break;

                case 3:
                    s.detailsshow();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Enter A valid Choice");

            }
        }




    }
}
