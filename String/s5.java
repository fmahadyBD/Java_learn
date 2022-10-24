public class s5 {
    //Write a Java program to compare two strings lexicographically. Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions
    public static void main(String[] args) {
        String a="Mahady Hasan Fahim";
        String b="Mahady Hasan Fahim";
        int result = a.compareTo(b);
        if(result<0){
            System.out.println("\n"+a+"lass then "+b);
        } 
       else if(result>0){
            System.out.println("\n"+a+"getar then "+b);
        }else{
            System.out.println("They are equal");
        }   
    }

    
}
