import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BfferOutputStream {
    public static void main(String[] args) throws Exception{
        FileOutputStream a=new FileOutputStream("Fahim.txt");
        BufferedOutputStream bout= new BufferedOutputStream(a);
        String x="Hi mahady Hasan Fahim";
        byte ba[]=x.getBytes();
        bout.write(ba);
        bout.flush();
        bout.close();
        a.close();
        
    }
    
}
