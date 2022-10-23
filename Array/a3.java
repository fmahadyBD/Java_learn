public class a3 {
    public static void main(String args[]) {
        //Write a Java program to calculate the average value of array elements
        int a[]={1,2,3,4,5,6};
        int sum=0;
        for(int k=0;k<a.length-1;k++){
            sum=sum+a[k];
        }
        int d=sum/a.length;
     System.out.println("The avarage of the arrays element: "+d); 

    }
    
}
