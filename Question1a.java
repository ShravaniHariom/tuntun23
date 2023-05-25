import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Question1a {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int size;
        int[] arr=new int[90];

        Set<Integer> setofarray=new HashSet<Integer>();

        System.out.println("Enter Size of Array : ");
        size=sc.nextInt();

        System.out.println("Enter Elements : ");
        for (int i = 0; i <size; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i <size; i++) {
            setofarray.add(arr[i]);
        }

        Object[] arr1=setofarray.toArray();

        System.out.println("Array Elements After Removing duplicates : ");
        for (int i = 0; i <arr1.length; i++) {
            System.out.println(arr1[i]);
        }

    }
}
