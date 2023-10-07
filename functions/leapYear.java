import java.util.*;
public class leapYear {
    public static void year(int year){
        if(year%4 == 0 && year%100 != 0){
            System.out.println("Year "  + year + " leap year");
        }
        else if(year%4==0 && year%100 == 0 && year%400 == 0){
            System.out.println("Year "+ year+ " is leap year ");
        }
        else{
            System.out.println("Year " + year + " is not leap year");
        }
    }
    public static void main(String args[]){
        int year;
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = Scan.nextInt();
        year(year);
        Scan.close();
    }
}
