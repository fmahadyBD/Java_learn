import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class Copyfiletofile {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name of the file that you want to copy:");
        String a=sc.nextLine();
        System.out.println("Enter the file name you want to past:");
        String b=sc.nextLine();

        File x= new File(a);
        File y= new File(b);
        FileInputStream in=new FileInputStream(x);
        FileOutputStream out=new FileOutputStream(y);
        try{
            int n;
            while((n=in.read())!=-1){
                out.write(n);
            }

        }finally{
            if(in!=null){
                in.close();
            }
            if(out!=null){
                out.close();
            }


        }
    }
}
