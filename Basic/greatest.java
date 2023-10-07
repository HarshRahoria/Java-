import java.util.*;
public class greatest {
    public static void main(String args[]){
        int num1, num2, num3, max;
        Scanner Scan =  new Scanner(System.in);
        System.out.println("Enter 3 intergers: ");
        num1 = Scan.nextInt();
        num2 = Scan.nextInt();
        num3 = Scan.nextInt();
        if(num1>=num2){
            if(num1>=num2){
                max = num1;
            }
            else{
                max = num2;
            }
        } else{
            if(num2>=num3){
                max = num2;
            }
            else{
                max = num3;
            }
        }
        System.out.println("Maximum among numbers : " + max);
        Scan.close();
    }
}
