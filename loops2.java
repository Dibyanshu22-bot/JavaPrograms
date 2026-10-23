import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
       double radius = sc.nextFloat();
       double area = 3.14*radius*radius;
     System.out.println("The area of circle is"+ area);
        sc.close();
        
    }
}
