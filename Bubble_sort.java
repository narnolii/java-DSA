public class Bubble_sort{


    static void bubble(int a[]){
        int i , j ,temp=0;
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length-1;j++){
                
                if(a[j]>a[j+1]){
                    
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }
       
    }


    public static void main(String[] args){
        int a[] = {2,5,1,3};
        bubble(a);



        for(int i=0;i<a.length;i++){
            System.out.println("sorted array is :" + a[i]);
        }
    }


}