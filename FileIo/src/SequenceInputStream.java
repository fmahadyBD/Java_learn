import java.io.FileInputStream;
import java.io.*;  

public class SequenceInputStream {
    public static void main(String[] args) throws Exception{
        FileInputStream a=new FileInputStream("fahim.txt");
        FileInputStream b=new FileInputStream("hasan.txt");
        SequenceInputStream sis=new SequenceInputStream(a,b);
        int i=sis.read();
        while(i!=-1){
            System.out.println((char)i);
        }



    }
    
}
