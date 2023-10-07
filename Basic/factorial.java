public class factorial {
    static int fact(int num){
        if(num == 1 || num == 0){
            return 1;
        }
        else{
            return num * fact(num-1);
        }
    }
    public static void main(String args[]){
        int num = 6;
        System.out.println("Factorial of 6 is: "+ fact(num));

    }
}
