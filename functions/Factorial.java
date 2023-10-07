import java.util.*;
public class Factorial {
    public static double calculateFcatorial(int a){
        if(a<0){
            System.out.println("Invalid!!");
            return 0;
        }
        if(a==1 || a==0){
            return 1;
        }
        else{
            return a * calculateFcatorial(a-1);
        }
    }
    public static void main(String args[]){
        int num; 
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        num = Scan.nextInt();
        System.out.println("Fctorial: "+ calculateFcatorial(num));
        Scan.close();

    }
}
