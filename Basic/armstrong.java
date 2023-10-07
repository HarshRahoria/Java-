// import java.lang.Math;
import java.util.*;
public class armstrong{
    public static void main(String args[]){
        int num ;
        int digit = 0;
        int temp, c;
        int count =0;

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter Number to check if its armstrong: ");
        num = Scan.nextInt();
        temp = num;

        while(num > 0){
            num = num / 10;
            ++digit;
        }
        // System.out.println(digit);
        num = temp;
        while(num > 0){
            c = num % 10;
            count = count + (int)Math.pow(c,digit);
            num = num / 10;
        }
        num = temp;
        // System.out.println(count);
        if(count == num){
            System.out.println("Number " + num + " is armstrong");
        }
        else{
            System.out.println(num + " not a armstrong number");
        }
        Scan.close();
    }
}