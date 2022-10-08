import java.util.Scanner;
class matrix_p{
    public static void main(String[] args) {
        int r1,r2,c1,c2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the r1 ");
        r1 = sc.nextInt();
        System.out.println("Enter the c1 ");
        c1 = sc.nextInt();
        System.out.println("Enter the r2 ");
        r2 = sc.nextInt();
        System.out.println("Enter the c2 ");
        c2 = sc.nextInt();
        
        int a[][] = new int[r1][c1]; 
        int b[][] = new int[r2][c2]; 
        int c[][] = new int[r1][c2];

        if(c1!=r1){
            System.out.println("Matrix not fome:--");
        }
        else{
            System.out.println("Enter the first matrix credential:");
            for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix credential:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("product of martrix is:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    c[i][k] += a[i][k]*b[k][j];
                }
                System.out.println(c[i][j] +"\t"+ " ");
               
            }
        }
    }
   }
}
