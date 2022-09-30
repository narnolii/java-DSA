import java.util.Scanner;
public class conductor{
   
    public static void main(){
        int a[]={1,2,5,10,20,50,100,200};
        int rem ,pro=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount you give to conductor :");
        int amt= in.nextInt();
        System.out.println("amt is: "+amt);
        System.out.println("Enter the ticket value :");
        int tic= in.nextInt();
        System.out.println("tic is: "+tic);

        rem=amt -tic;
        for(int i=9;i>=0;i--){
            if(rem>=a[i]){
                pro++;
                rem = rem- a[i];
                

             }
             else if(rem<a[i]){
                continue;
             }

        }
        System.out.println("Notes is:"+ pro);

    }
    
}
