import java.util.Scanner;
public class w5a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=(i+1)*10;
            System.out.print(a[i]+" ");
        }
    }
}
