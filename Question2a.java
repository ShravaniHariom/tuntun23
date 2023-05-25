import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Question2a {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String newstr;
        int duplinum=0;

        System.out.print("Enter a String: ");
        newstr=sc.nextLine();

        HashMap<String,Integer> strsc= new HashMap<String,Integer>(90);
        String[] newstrarr=newstr.split(" ");



        for (int i = 0; i < newstrarr.length; i++) {

            if (strsc.containsKey(newstrarr[i])){
                duplinum++;
                String key1= strsc.keySet().toString();
            }else{
                strsc.put(newstrarr[i],1);
            }
        }
        System.out.println("Number of Duplicates Are : "+duplinum);


    }
}
