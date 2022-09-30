public class Heap_tree {

    public static void heapify(int a[], int n , int i){
        int larg = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<n && a[left]>a[larg]){
            larg = left;
        }
        if(right<n && a[right]>a[larg]){
            larg = right;
        }
        if(larg!=i){
            int temp = a[i];
            a[i] =a[larg];
            a[larg] = temp;
        }
    }


    public static void heapSort(int a[],int n){
        for(int i=n/2 -1;i>=0;i--){
            heapify(a,n,i);
        }

        for(int i=n-1;i>=0;i--){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;

            heapify(a,i,0);
        }
        
    }

    public static void main(String[] args){
        int a[] = {81,89,9,11,14,76,54,22};
        int n =a.length;
        
        heapSort(a,n);
        for(int i=0;i<n;i++){
            System.out.println("Sorted array is"+a[i]);
        }
           
    }
    
}
