public class getBit {
    public static void main(String[] args){
        // this is used to get bit at any position in the binary equivalent of the number
        // Imagine a number 7 and we ahve to find that what bit is on the position 2 (starting from right to left)
        // 7 => 111, therefore position 2 contains 1
        // in code we will find it by creating a bit mask

        int num = 12;
        // number to check position
        int position = 1;
        // position to be checked
        int bitmask = 1;
        // intially put it 1 to do the left shift
        
        // now to do the left shift times this position i.e. 
        // bitmask<<position
        // and then AND it with the Number, 
        // if result is 0 then bit was : 0
        // else bit was: 1

        ;
        if(((bitmask << position)  & num) == 0){
            System.out.println("Bit at position " + position +" was:  0");
        }
        else{
            System.out.println("Bit at position " + position +" was:  1");
        }
    } 
}
