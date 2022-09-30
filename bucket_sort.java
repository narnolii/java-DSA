public class bucket_sort {

    static void bucket(int a[] ,int n){
        int i,j;
        int a1[n];
        for(i=0;i<n;i++){
            a1[i]=0;
        }
        //2.put a[] value in a1[];
        for(i=0;i<n;i++){
            a1[a[i]]++;
        }


       for(i=0,j=0;i<n;i++){
        for(;a1[i]>0;(a1[i])--){
            a1[j++]=i;
        }
       }


    }



    public static void main(String[] args){
        int a[] = {5,3,7,1,89,2};
        int n= a.length;
        bucket(a , n);
        
        for(int i=0;i<a.length;i++){
            System.out.println("sorted aray is"+a[i]);
        }
    }
    
}
