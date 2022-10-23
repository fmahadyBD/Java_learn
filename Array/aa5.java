
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class aa5 {
    /**
     * @param args
     */

     //https://www.delftstack.com/howto/java/param-java/
    public static void main(String args[]){
        Integer [] a=new Integer[]{1,2,3,4,56};
        String [] n=new String[]{"Hi","Baby","void"};
        Integer [] b=new Integer[]{4,2,3,4,5,6,7};
        //List<Integer> intList = new ArrayList<>(Arrays.asList(a));
        //List<Integer> aa=new ArrayList<>(Arrays.asList(a));
        List<Integer> a1=new ArrayList<>(Arrays.asList(a));
        List<String> n1=new ArrayList<>(Arrays.asList(n));
        System.out.println(a1.contains(4));
        System.out.println(n1.contains("baby"));




    }
    
}
