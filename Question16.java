import java.util.HashMap;
import java.util.Scanner;

public class Question16 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String inputstring=sc.nextLine();
        String[] names=inputstring.split(" ");

        HashMap<String,Integer> hmap= new HashMap<String,Integer>(90);

        for (int i = 0; i < names.length; i++) {

            if (hmap.containsKey(names[i]))
            {
                int count = hmap.get(names[i]);
                System.out.println("count is "+hmap.keySet());
                hmap.put(names[i], count+1);
            }
            else
            {
                hmap.put(names[i], 1);
            }


        }

        System.out.println("Hashmap is "+hmap);






    }
}
