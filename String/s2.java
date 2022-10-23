public class s2 {
    public static void main(String args[]) {
        // Write a Java program to get the character (Unicode code point) at the given
        // index within the String. Go to the editor

        String a = "Love you";
        System.out.println("The main string is :" + a);
        int a1 = a.codePointAt(0);
        // we can get the unicode like ASCII in c and cpp,why codepointat
        System.out.println("The codePontAt: " + a1);

    }

}