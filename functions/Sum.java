import java.util.*;

public class Sum{
    private static int calculateSum(int a, int b){
        return a+b;
    }
    public static void  main(String args[]){
        Scanner Scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter two intergers: ");
        num1 = Scan.nextInt();
        num2 = Scan.nextInt();
        System.out.println("Sum of Numbers: "+ calculateSum(num1, num2));
        Scan.close();
    }
}