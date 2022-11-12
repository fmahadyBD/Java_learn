import java.io.File;
import java.io.IOException;


public class fileCreate {
    public static void main(String[] args) {
        try{
            File obj=new File("fahim.txt");
            if(obj.createNewFile()){
                System.out.println("Create successfully"+obj.getName());
            }else{
                System.out.println("Already Created");
            }


        }catch(IOException e){
            e.printStackTrace();


        }
    }
    
}
