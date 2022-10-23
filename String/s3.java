public class s3 {
    //Write a Java program to get the character (Unicode code point) before the specified index within the String.
    public static void main(String args[]){
        String x="I will wait for you";
        System.out.println("The main string is: "+x);
        int a=x.codePointBefore(3);
        System.out.println("The codepointbefore: "+a);
        System.out.println("The CharAt: "+(char)a);
        int b=x.codePointAt(3);
        // this is unicode UFT
        System.out.println("The codepointAt:"+a);


    }
    
}
