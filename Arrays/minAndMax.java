import java.util.*;



public class minAndMax {
    public static void main(String args[]){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = Scan.nextInt();
        int min = Integer.MAX_VALUE; //Integer.MAX_VALUE assigns a maximum value 2^31-1 in min
        int max = Integer.MIN_VALUE; //Integer.MIN_VALUE assigns a minimum value -2^31 in max
        
        int Arr[] = new int[size];
        for(int i=0; i<size; i++){

            System.out.print("Arr[" + (i) + "] : ");
            Arr[i] = Scan.nextInt();
        }
        // System.out.println("Array is: ");
        for(int i=0; i<size; i++){
            if(Arr[i]>max){
                max = Arr[i];
            }
            if(Arr[i]<min){
                min = Arr[i];
            }
        }
        
        System.out.println("Maximun value in array is: " + max);
        System.out.println("Minimum value in array is: " + min);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        Scan.close();
    }
}
