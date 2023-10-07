// public class rightPryamid {
   
//     public static void main(String args[]){
       
//         for(int i=5; i>0; i--){
//             for(int j =1; j<=5; j++){
//                 if(j<i){
//                     System.out.print("   ");
//                 }
//                 else if(j>=i){

//                     System.out.print(" * ");
//                 }
                
//             }
//             System.out.println();
//         } 
//     }
// }

//differnt version

public class rightPryamid {
   
    public static void main(String args[]){
       
        for(int i=1; i<=5; i++){
            for(int j =1; j<=5-i; j++){
                System.out.print("   ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" * ");
            }
            System.out.println();
        } 
    }
}
