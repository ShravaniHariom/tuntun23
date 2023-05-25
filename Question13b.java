import java.io.*;

public class Question13b {
    public static void main(String[] args) throws IOException {
        File f1=new File("C:\\Users\\adity\\IdeaProjects\\JAVA_LAB_EXAM\\src\\program.txt");
        String[] words=null;
        int wc=0;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s;
        while((s=br.readLine())!=null)
        {
            words=s.split(" ");
            wc=wc+words.length;
        }
        fr.close();
        System.out.println("Number of words in the file:" +wc);
    }
}
