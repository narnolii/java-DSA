public class Insertion_sort {


    static void insert(int a[]){
        int i,j;
        for(i=0;i<a.length;i++){
            int temp=a[i];
            for(j=i-1;j>=0;j--){
                if(temp<a[j]){
                    a[j+1]=a[j];
                }
                else{
                    break;
                }
            }
            a[j+1]=temp;
        }


    }

    public static void main(String[] args){
        int a[]={2,5,1,8,5,9,4};
        insert(a);

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
