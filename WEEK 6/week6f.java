import java.util.Scanner;
public class week6f {
    public static void main(String[] args){
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
        System.out.print("ENTER TERM TO FIND ");
        int t= input.nextInt();
        boolean isfound=false;
        for(int j=0;j<n;j++){
            if(a[j]==t){
                System.out.println(t+" is found at index "+ j);
                isfound=true;
                break;
            }
        }if (isfound==false)
            System.out.println(t+" is not found");
    
}}
