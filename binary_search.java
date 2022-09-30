import java.util.Scanner;
public class binary_search {
    public static void main(String ad[]){
        int a[] = {2,3,4,56,6};
        int mid ;
        int first;
        int last;

        first=0;
        last= (a.length-1);
        
        int k=0;
        Scanner b = new Scanner(System.in);
        System.out.print("enter a number = ");
        int num = b.nextInt();
        while(first<=last){
            mid = (first+last)/2;
        if(num==a[mid]){
            k=1;
            break;
        }
        else if(num<a[mid]){
            last = mid 

        }
        else if(num>a[mid]){
            first = mid+1;
        }
        }
        if(k==1){
            System.out.print("number is found");
        }
        else{
            System.out.print("number not found.");
        }
    }
}
