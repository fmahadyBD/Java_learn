import java.nio.file.Files;
import java.nio.file.Path;

public class fileIO {
public static void main(String[] args) throws Exception {
    // it will create file automitc and read and write it. it can also read write doc
    String s="Hi";
    Path fo=Path.of("k.doc");
 
    Files.writeString(fo, s);

    String fileContent=Files.readString(fo);
    System.out.println(fileContent);

    
}    
}
