//StringBuilder is advanced form of string, which help in directing updation in orginal string which enhances the user experience
// import java.util.*;
public class BuilderString {
    public static void main(String args[]){
        //declaration
        StringBuilder sb = new StringBuilder("Rahoria");
        System.out.println(sb);

        //printing character at a given location charAt(index)
        System.out.println(sb.charAt(0));

        //changing charracter at location setCharAt(index, chracter)
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //to insert a value in the string and shift rest of it
        // mary inserting p to start -> pmary
        //works only for single character 
        
        sb.insert(0,'k');
        System.out.println(sb);

        sb.insert(sb.length(), 'H');
        System.out.println(sb);

        //deleting a portion from the string using .delete(startIndex, finalIndex)
        //final index is not included in the function

        sb.delete(0, 4); //it will delete up to index 3 starting from 0
        System.out.println(sb);

        //to append in last .append(character)

        sb.append('h');
        System.out.println(sb);

        //to reverse a strind we use .reverse()
        
        System.out.println(sb.reverse());
    }
}
