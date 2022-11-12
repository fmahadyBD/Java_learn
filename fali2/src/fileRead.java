import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileRead {
    
    public static void main(String[] args) {
        try{
            File obj=new File("f.txt");
            Scanner reader=new Scanner(obj);
            while(reader.hasNextLine()){
                String s=reader.nextLine();
                System.out.println(s);
            }
            reader.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();

        }
    }
    
}
