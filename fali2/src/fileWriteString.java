import java.io.FileWriter;

public class fileWriteString {
    public static void main(String[] args) throws Exception {
       
        String s="hi";
        

            FileWriter fwr= new FileWriter("a.txt");
            fwr.write(s);
        


    }
    
}
