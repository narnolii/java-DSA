public class Quick_sort{

    static void quickr(int a[] ,int first ,int last){
     
    int pivot = a[last];
    int fi = first;
    int la = last;
    
    for(int i=0;i<a.length;i++){
        if(a[pivot]>a[fi]){
            a[fi]++;
        }
        else if(a[pivot]<a[fi]){
            int temp;
            temp=a[pivot];
            a[pivot]=a[fi];
            a[fi]=temp;
        }
        else if(a[la]>a[pivot]){
            a[la]--;
        }
        else if(a[la]<a[pivot]){
            int temp;
            temp=a[pivot];
            a[pivot] = a[la];
            a[la]=temp;

        else(a[ls]==a[fi]){
            quickr();
        }
        }
    }

     
 
 
    }
 
 
}
 
 
 
    static void quick(int a[],int start,int last){
     if(start>=last){
         return 0;
     }
     quickr(a,start ,mid,last);

     quick(a, start , mid);
     quick(a,mid+1,last);
 
     

    }
 
 
 
 
 
 
 
     public static void main(){
        int a[] ={4,3,7,2,78,23};
 
        quick(a);
 
        for(int i=0;i<a.length;i++){
            System.out.println("array is : "+a[i]);
        }
 
    }
     
}
 