import java.util.*;
public class declaration{
    public static void main(String args[]){
        int[][] Numbers = new int[5][5];
        Scanner Scan = new Scanner(System.in);
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                Numbers[i][j] = Scan.nextInt();
            }
        }
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
               System.out.print(" "+ Numbers[i][j] + " ");
            }
            System.out.println();
        }
        Scan.close();
        
    }
}