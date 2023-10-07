// public class invertedHalfPryamid {
//     public static void main(String args[]){
//         for(int i=0; i<5; i++){
//             for(int j=5; j>i; j--){
//                 System.out.print(" * ");
//             }
//             System.out.println();
//         }
//     }
// }

//varition

public class invertedHalfPryamid {
    public static void main(String args[]){
        for(int i=5; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}