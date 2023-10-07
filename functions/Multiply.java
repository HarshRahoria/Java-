import java.util.*;

public class Multiply {

    public static int calculateMultiply(int a , int b){
        return a*b;
    }
    public static void main(String args[]){
        int num1, num2;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        num1 = Scan.nextInt();
        num2 = Scan.nextInt();
        System.out.println("Multiplication of numbers: " + calculateMultiply(num1, num2));
        Scan.close();
    }
    
}
