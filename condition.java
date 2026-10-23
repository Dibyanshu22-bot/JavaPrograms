import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a==3) 
            System.out.println("Bonjour");
        
        else if (a==2) 
            System.out.println("Namaste");
        else if (a==1)
            System.out.println("Hello");
        
        else 
            System.out.println("Invalid input");
        
        sc.close();
    }









}