import java.util.Scanner;
public class week6d {
    public static void main (String[] args){
        int temp;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter an integer :");
        int n = input.nextInt();
        
        int[] a= new int[n];
        System.out.print("Enter "+n+" elements: ");
        for (int i=0;i<n;i++){
            a[i]=input.nextInt();
        
        }
        System.out.println("Array elemnts: ");
        for (int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
        int max = a[0];
        for(int i=1;i<n;i++){
            if(max<a[i])
                max=a[i];
        }
        int min = a[0];
        for(int i=1;i<n;i++){
            if(min>a[i])
                min=a[i];
        }System.out.println("Maximum elemnet= "+max+" and  Minimum element= "+min);
        }
    }

