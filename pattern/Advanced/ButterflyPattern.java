import java.util.*;

public class ButterflyPattern{
    public static void main(String args[]){
        int n ; 
        Scanner Scan = new Scanner(System.in);
        n = Scan.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            for(int j=1; j<=2*(n - i); j++){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            for(int j=1; j<=2*(n - i); j++){
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        Scan.close();
    }
}