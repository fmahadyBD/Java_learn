import java.io.FileInputStream;

public class FileinputStream1{
public static void main(String[] args) {
    try{
        FileInputStream a=new FileInputStream("fahim.txt");
        int i=a.read();
        System.out.print((char)i);
        a.close();

    }catch(Exception e){
        System.out.println(e);
    }
}
}