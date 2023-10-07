import java.util.Scanner;
public class hollowRect {
    public static void main(String args[]){
        int n,m;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter n and m: ");
        n = Scan.nextInt();
        m = Scan.nextInt();
        for(int i=1;  i<=n; i++){
            for(int j=1; j<=m; j++){
                if((i==1 || i==n) || (j==1 || j==m)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
        Scan.close();
    }
}
