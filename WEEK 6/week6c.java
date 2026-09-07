import java.util.Scanner;
public class week6c {
    public static void main (String[] args){
        int temp;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer :");
        int n = input.nextInt();
        
        int[] a= new int[n];
        System.out.println("Enter "+n+" elements: ");
        for (int i=0;i<n;i++){
            a[i]=input.nextInt();
        
        }
        System.out.println("Array elemnts berfore swapping last 2 elements: ");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        
        temp=a[n-1];
        a[n-1]=a[0];
        a[0]=temp;
        
        System.out.println("Array elemnts after swapping last 2 elements: ");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}