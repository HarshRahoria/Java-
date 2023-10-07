import java.util.*;

public class function {
    // Scanner Scan = new Scanner(System.in);
    private static void printStrings(String S1, String S2){
        System.out.println(S1);
        System.out.println(S2);
    }
    static void takeName(String str1, String str2){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the strings: ");
        System.out.println("String 1: ");
        str1 = Scan.nextLine();
        System.out.println("String 2");
        str2 = Scan.nextLine();
        printStrings(str1, str2);
        Scan.close();
    }
    public static void main(String args[]){
        Scanner Sc = new Scanner(System.in);
        String name ="";
        String naam = "";
        takeName(name, naam);
        int Button;
        Button = Sc.nextInt();
        switch(Button){
            case 1: 
                    System.out.println("Nameste");
                break;
            case 2: 
                    System.out.println("Hello");
                break;
            case 3: 
                    System.out.println("Bonjour");
                break;
            default:
                    System.out.println("Shii se value enter kar");
        }
        Sc.close();
    }
}
