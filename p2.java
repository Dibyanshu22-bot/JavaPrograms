public class p2 {
    public static void main(String[]args){
         //outer  loop
        for(int i = 0 ; i<4 ; i=i+3 ) {
            //innerloop
            for(int j= 1; j<=5; j=j+4){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
