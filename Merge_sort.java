class merge_sort {
    
static void concure(int a[] , int first ,int mid, int last){

    int arr[]  = new int[first-last+1];
    int  i =first;
    int j = last;
    int x=0;

    while(i<=mid && mid<=j){
        if(a[i]<=a[mid]){
            arr[x++] = a[i++];
        }else{
            arr[x++] = a[j--];
        }

    }
    while(i<=mid){
        arr[x++] = a[i++];
    }
    while(mid<=j){
        arr[x++] = a[j--];
    }
    
    for(int q=0; int  p=first; q< arr.length; q++; p++){
        a[p] = arr[q];
    }
   
    
}

public static void divide(int a[] , int first  , int last){ 
    if(first>=last){
        return;

    }
    int mid = (last-first)/2;

    divide(a[] , first , mid);
    divide(a[] , mid+1 , last);
    concure(a[] , first , mid , last);

}





public static void main(Static[] args){
    int a[] ={5,2,8,34,1,8};
    merge(a ,0, a.length-1);

for(int i=0;i<a.length;i++){
    System.out.println("sorted arraty is:"+a[i]);
}    
}


}
