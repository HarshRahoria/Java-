import java.util.*;

public class swap {

    public static int Swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Num1: " + a+ "\nNum2: "+ b);
        return 0;
    }
    public static void main(String args[]){
        int num1, num2;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        num1 = Scan.nextInt();
        num2 = Scan.nextInt();
        Swap(num1, num2);
        Scan.close();

    }
    
}
