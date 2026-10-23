import java.util.Scanner;

public class p1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        //outer  loop
        for(int i = 0 ; i<n ; i++ ) {
            //innerloop
            for(int j= 1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}