import java.util.*;

interface A{
    public void President(String P_Name);
}
interface B{
    public void VicePresident(String VP_Name);
}
interface C{
    public void Secratry(String S_Name);
}
class Comittee implements A, B, C{
    Scanner Sc = new Scanner(System.in);
    // Comittee(){
    //     System.out.print("Enter the name of president: ");
    //     String President = Sc.nextLine();
    //     System.out.print("Enter the name of president: ");
    //     String Vice_President = Sc.nextLine();
    //     System.out.print("Enter the name of president: ");
    //     String Secratey = Sc.nextLine();
    // }
    public void President(String P_Name){
        System.out.println("President is: " + P_Name);
    }
    public void VicePresident(String VP_Name){
        System.out.println("Vice President is: " + VP_Name);
    }
    public void Secratry(String S_Name){
        System.out.println("Secretery is: " + S_Name);
    }
}
class Test{
    public static void main(String agrs[]){
        Comittee EC = new Comittee();
        EC.President("Harshit");
        EC.VicePresident("Abhishek");
        EC.Secratry("Radhika");

    }
}