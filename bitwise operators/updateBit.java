public class updateBit {
    public static void main(String args[]){
        // it is used to update bit at a given position by a given updation
        // like update to 0 or update to 1
        // Case 1: update to  0
        // * create a bitmask 
        // * do left shift (bitmask << position)
        // * do compliment of the bitmask (~bitmask)
        // * AND the bitmask with the number

        int num = 9;
        int position = 0;
        // update to 0
        int bitmask = 1;
        int newNumber;
        newNumber = ((~(bitmask << position)) & num);
        System.out.println("Updated Number: (upadte to 0)" + newNumber);
        
        
        // Case 2: update to 1
        // * create bitmask
        // * do left shift times position (bitmask << position)
        // * do the OR with the number
        
        int num2 = 10;
        int pos = 2;
        int upadtedNumber;
        upadtedNumber = ((bitmask << pos) | num2);
        System.out.println("Updated Number: (upadte to 1)" + upadtedNumber);
        
    }
}
