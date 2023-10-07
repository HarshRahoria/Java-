// import java.util.*;
//Strings are immutable in Java everytime with updation in string orginal string is deleted and new string with updation is created
public class Strings{
    public static void main(String args[]){
        String firstName = "Harsh";
        String lastName = "Rahoria";
        String temp = "rahoria";
        
        //concatanation
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        //length .length()
        System.out.println(fullName.length());
        
        //reading character by chracter charAt(index);
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        //comparing 2 strings callingString.compareTo(StringToBeCompared)
        // s1.compareTo(s2)
        // if s1>s2 returns +ve value
        // if s1==s2 returns 0
        // if s1<s2 returns -ve value
        System.out.println(temp.compareTo(lastName));

        // using directly == operator fails in this situation becuse strings are not a data type they actually are 
        // objects, therefore we use .compareTo() function
        if(new String("Rahoria") == new String("Rahoria")){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Not equal");
        }

        //extracting a substring .substring(intialIndex, finalIndex)
        System.out.println(lastName.substring(4,lastName.length()));
    }
}