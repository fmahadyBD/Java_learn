import java.io.FileOutputStream;

public class OutputStream {
    public static void main(String[] args) {
        try{
            FileOutputStream a=new FileOutputStream("fahim.txt");
            String s="hi fahim";
            byte b[]=s.getBytes();
            a.write(b);
            a.close();

        }catch(Exception e){

        }
    }
    
}
