import java.util.*;
class matrix_p{
    public static void main() {
        int r1,r2,c1,c2;
        int a[][] , b[][], c[][];
        Scanner sc = Scanner(System.in);
        System.out.println("Enter the r1 ");
        r1 = sc.nextInt();
        System.out.println("Enter the c1 ");
        c1 = sc.nextInt();
        System.out.println("Enter the r2 ");
        r2 = sc.nextInt();
        System.out.println("Enter the c2 ");
        c2 = sc.nextInt();

        if(c1!=r1){
            System.out.println("Matrix not fome:--");
        }
        else{
            for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
                System.out.println(c[i][j]+ " ");
               
            }
        }
    }
        

    }
    
}
