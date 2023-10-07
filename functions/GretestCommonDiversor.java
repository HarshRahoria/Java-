import java.util.*;

public class GretestCommonDiversor {

    public static int CommonDiversor(int a, int b){
        int diversor = 1;
        int i =1;
        for(i = 1; (i<=a && i<=b); i++){
                if((a%i == 0) && (b%i == 0)){
                    if(diversor>=i){
                        continue;
                    }
                    else{
                        diversor = i;
                    }
                }
            
            
        }
        
        return diversor;

    }
    public static void main(String args[]){
        int num1, num2;
        Scanner Scan = new Scanner(System.in); 
        System.out.println("Enter 2 integers: ");
        num1 = Scan.nextInt();
        num2 = Scan.nextInt();
        CommonDiversor(num1, num2);
        System.out.println("Gretest common diversor is: " + CommonDiversor(num1, num2));
        Scan.close();
    }
}
