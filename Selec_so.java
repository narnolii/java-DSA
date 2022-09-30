public class Selec_so{

    static void selection(int a[]){
        int i,j;
        for(i=0;i<a.length;i++){
            int min=i;
            for(j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp;
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }

public static void main(String[] args){
        int a[] = {2,5,1,3};
        selection(a);

    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }    
    }
}
