public class clearBit {
    public static void main(String args[]){
        // to perform clearbit we will reset the bit at given position
        // we will use bitmask for it
        // first we will use left shift and then NOT operation and then AND operation

        int number = 12; // (12 => 1100)
        int position = 2;
        int bitmask = 1; // (1 => 001)
        int newNumber;
        
        // // Step by step 
        // bitmask = (bitmask << position);
        // // bitmask => 100
        // bitmask = ~bitmask;
        // //bitmask => 011
        // newNumber = (number & bitmask); // newnumber => 1000

        // Direct

        newNumber = ((~(bitmask << position)) & number);
        System.out.println("New number: " + newNumber);

    }
}
