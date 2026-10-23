import java.util.Scanner;

public class condition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double Sum = a+b;
        double Dif = a-b;
        double Mul = a*b;
       double Div = a/b;
        double mod = a%b;
      int operations = sc.nextInt();
        switch (operations) {
            case 1 : System.out.println("Sum of the two numbers is: " + Sum);
            break;
            case 2 : System.out.println("Difference of the two numbers is: " + Dif);
            break;
            case 3 :System.out.println("Multiplication is: " + Mul);
            break;
            case 4 :if(b==0){
                System.out.println("INVALID DIVISION");
            }else{ System.out.println("Division of the two numbers is: " + Div);}
            break;
            case 5 : if(b==0){
                System.out.println("INVALID MODULUS)");
            }else{System.out.println("Modulo of the two numbers is: " + mod);}
            break;
            default : System.out.println("Invalid input");

        }

     
        sc.close();
    }
}
