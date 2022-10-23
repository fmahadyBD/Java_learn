public class a1{
    // Write a Java program to sort a numeric array
    public static void main(String args[]) {

        int a[]={4,3,1,2,5,6,0};

        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                int tem=a[j];
                if(a[j]>a[j+1]){

                    a[j]=a[j+1];
                    a[j+1]=tem;
                }
            }
        }

        System.out.println(a);
        
    }
}