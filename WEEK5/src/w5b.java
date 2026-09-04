import java.util.Scanner;
public class w5b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a[]= new int[n];
        int sum=0;
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
            sum+= a[i];
        }System.out.println("Sum of array = "+sum);
    }
}
