import java.util.*;

public class Array{
    public static void main(String args[]){
        int[] Marks = new int[4];
        
        //int Marks[] = new int[4]; Also works

        // int Marks[] = {1,2,3,4,5,6,7,8,9}; Another way
        // int Marks[] = new int[Size]; Size should be declared earlier

        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter marks: ");
        for(int i =0; i<3; i++){
            System.out.print("Subject " + (i+1) + " : ");
            Marks[i] = Scan.nextInt();
        }
        for(int i=0; i<3; i++){
            System.out.println ("Subject " + (i+1) + " : "+ Marks[i]);
        }
        Scan.close();
        System.out.println(Marks.length);//returns size of array
        return;
    }
}