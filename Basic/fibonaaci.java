
public class fibonaaci {
    public static void main(String args[]){
        int a = 0;
        int b = 1,c;
        int temp, count = 10;
        temp = 3;
        System.out.println(a+"\n"+b);
        while(temp<=count){
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
            temp++;
        }
    }
}
