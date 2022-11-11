import java.io.FileInputStream;

public class BufferedInputStream {

    public static void main(String[] args) {
        try{
            FileInputStream fin=new FileInputStream("fahim.txt");
            BufferedInputStream bin=new BufferedInputStream(fin); 
            int i;
            while((i=bin.read())!=-1){
                System.out.println((char)i);
            }  
            

        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
