public class s6 {
    public static void main(String[] args) {
        /*
         * Write a Java program to compare two strings lexicographically, 
         * ignoring case differences.
         */


        String a="Mahady HaSan Fahim";
        String b="Mahady Hasan Fahim";
        int result = a.compareToIgnoreCase(b);
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
