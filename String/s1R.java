import java.util.Scanner;

public class s1R {
    public static void main(String args[]) {

        String a = "Mahady Hasan Fahim";
        System.out.println("The String: " + a);
        System.out.println("Enter the index of you want to find character: ");
        Scanner sc = new Scanner(System.in);
        while (true) {

            int x = sc.nextInt();
            int b = a.charAt(x);
            System.out.println("the index's char is: " + (char) b);

        }

    }

}
