import java.util.*;
class Main {
    public static void main(String[] args){
        int  temp=0, i ,j;
        int a[] = {4,2,6,1,78,54};
       /*
        for(i=0 ;i<n;i++){
            System.out.println("Enter the %d value");
            int a[] = nextInt();
        }
        */

        for(i=0;i<a.length;i++){
            for(j=0;j<a.length-i;j++){
                
               if(a[j]>a[j+1]){
                temp=a[j+1];
                a[j+1] = a[j];
                a[j]=temp;
               }
            }
        }
        for(i=0;i<a.length;i++){
            System.out.println("sdmjfkc"+a[i]);
        }

    }
    


}
