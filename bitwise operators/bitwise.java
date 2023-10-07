import java.util.*;

public class bitwise{
    public static void main(String args[]){
        int num1 = 5;
        int num2 = 6;
        //compliment Operation ~ (bitwise Compliment)
        System.out.println("Bitwise Compliment: " + (~num1));
        //or operation | (bitwise OR)
        System.out.println("Bitwise OR: " + (num1 | num2));
        //and operation & (bitwise AND)
        System.out.println("Bitwise AND: " +  (num1 & num2));
        //X-OR Operation ^ (bitwise X-OR)
        System.out.println("Bitwise X-OR: " + (num1 ^ num2));
        // left circular shift / Binary left shift <<
        // number << postions to shift
        // (NUM << pos)
        System.out.println("Left shift num1: " + (num1 << 3));


    }
}