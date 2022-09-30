public class Selectio_sort{

    static void selection(int a[]){
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    int temp;
                    temp=a[min];
                    a[min]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

public static void main(){
        int a[] = {2,5,1,3};
        selection(a);

    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }    
    }
}
