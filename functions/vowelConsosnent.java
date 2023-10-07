// import java.util.*;

public class vowelConsosnent {
    public static void  check(char str){
        if(str == 'a'|| str == 'e'|| str == 'i'|| str == 'o' || str == 'u'|| str == 'A' || str == 'E' || str == 'I' || str == 'O' || str == 'U'){
            System.out.println("Character is vowel");
        }
        else{
            
            System.out.println("Character is consonent");
        }
    }
    public static void main(String args[]){
        char ch = 'n';
        // Scanner Scan = new Scanner(System.in);
        // System.out.println("Enter a chracter: ");
        // ch = Scan.nextChar();
        check(ch);
        // Scan.close();


    }
}
