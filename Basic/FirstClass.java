import java.util.*;

class FirstClass {
    public static void main(String args[]) {
        int A = 5;
        int B = 6;
        String str = "Harshit Kumawat";
        System.out.println(A + B);
        for (int i = 0; i < 4; i++) {
            System.out.println("Hello World");
        }
        if (A < B) {
            System.out.println("A is less than B");
        } else {
            System.out.println(
                    "B is less than A");
        }
        System.out.println(str);

        Scanner Scan = new Scanner(System.in);

        String name = Scan.nextLine();

        System.out.print(name);
        Scan.close();
    }

}