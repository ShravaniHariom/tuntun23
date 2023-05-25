import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Question1b
{

    public static void main(String[] args) {

        int size1,size2;
        int[] arr1=new int[90];
        int[] arr2=new int[90];

        ArrayList <Integer> commonarr= new ArrayList<Integer>(90);


        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Capacity1 : ");
        size1=sc.nextInt();

        System.out.println("Enter Capacity1 : ");
        size2=sc.nextInt();

        System.out.println("Enter Elements of First Array : ");
        for (int i = 0; i < size1; i++) {
            arr1[i]=sc.nextInt();
        }

        System.out.println("Enter Elements of Second Array : ");
        for (int i = 0; i < size2; i++) {
            arr2[i]=sc.nextInt();
        }

        for (int i = 0; i < size2; i++) {
            if (arr1[i]==arr2[i]){
                commonarr.add(arr2[i]);
            }
        }

        System.out.println("Common elements are : ");
        Iterator<Integer> ic = commonarr.iterator();
        while(ic.hasNext()){
            System.out.println(ic.next());
        }



    }
}
