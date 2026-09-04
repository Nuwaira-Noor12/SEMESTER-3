import java.util.Scanner;
public class w5f {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int f=1;
        if(n==0||n==1)
            f=1;
        else{
            for(int i=2;i<=n;i++)
                f=f*i;}
        System.out.println("Factorial ="+f);
    }
}
