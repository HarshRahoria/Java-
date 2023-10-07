import java.util.*;

public class setBit {
    // It sets (Makes it 1) the bit of a number at position specified
    // Again we will use bitmask is this function as specified in getBit 
    // but now we will OR this bit mask and whole process will same
    public static void main(String[] args){

        int num = 7; // ( 7=>  111)
        int position = 4;
        int bitmask = 1; // ( 1=> 001)
        
        num = ((bitmask << position /* 10000 */) | num); //num => 10111 => 23
        System.out.println("New number will be: " + num);
    }

}
