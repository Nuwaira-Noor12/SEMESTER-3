import java.util.Scanner;
public class w5e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum=0;
        int r;
        while(n!=0){
            r=n%10;
            n=n/10;
            sum += r;
        }System.out.println("sum of digits = "+sum);
    }
}
