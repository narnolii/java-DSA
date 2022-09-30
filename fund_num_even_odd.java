import java.util.*;
public class fund_num_even_odd {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();

        even_odd(num);

    }

public static void even_odd(int num){
    if(num%2==0){
        System.out.println("NUmber is even"+ num);
    }
    else{
        System.out.println("NUmber is odd"+ num);
    }

}    

}
