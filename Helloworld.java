import java.util.*;
public class Helloworld{
    public static void main(String ar[]){
        int k = 0;
        Scanner sc = new Scanner(System.in);
        int a[] = new int [5];
        System.out.print("Enter the 5 num:  ");
        for(int i=0;i<a.length;i++){
            
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the number to search ");
        int num = sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(num==a[i]){
                k=1;
            }
        }
        if(k==1)
        {
            System.out.print("number is found.");
        }
        else
        {
            System.out.print("number is not found.");
        }
        
    }
}