import java.io.File;

public class fileDeleted {
    public static void main(String[] args) throws Exception {
        File ob=new File("fahim.txt");
        if(ob.delete()){
            System.out.println("Delete the file "+ob.getName());
        }else{
            System.out.println("Not work");
        }
        
    }
    
}
