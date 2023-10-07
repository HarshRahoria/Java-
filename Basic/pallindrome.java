public class pallindrome {
    public static void main(String args[]){
        int num = 141;
        int temp = num;
        int rev = 0;
        while(num % 10 != 0){
            rev =  (rev * 10) + (num % 10);
            num = num / 10;
        }
        // System.out.println(rev);
        num = temp;
        if(num == temp){
            System.out.println("Number " + num + " is pallindrome");
        }
        else{
            
            System.out.println("Number " + num + " is pallindrome");
        }
    }
}
