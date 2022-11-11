import java.io.FileOutputStream;

public class file1{

public static void main(String[] args) {
    try{
        FileOutputStream fout=new FileOutputStream("fahim.txt");
        fout.write(67);
        //67 means C
        fout.close();
    }catch(Exception e){

System.out.println(e);
    }
}

}