import java.util.Scanner;

public class a5 {
    //Write a Java program to test if an array contains a specific value
    /**
     * @param args
     */
    public static void main(String args[]){

        int d,cout=0;
        int a[]={5,3,5,6,2,3,1,7};
        System.out.println("Enter the number you want to search in the array");
        Scanner sc=new Scanner(System.in);
        d=sc.nextInt();
        Level:
        for(int i=0;i<a.length-1;i++){
            
            if(d==a[i]){
                System.out.println("Matched");
                break Level;
            }else{
                cout=cout+1;
            }
        }

        if(cout>1){
            System.out.println("Sorry not match");
        }
        sc.close();
    }

    @Override
    public String toString() {
        return "a5 []";
    }
}
