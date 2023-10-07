import java.util.*;

public class coumpundIntrest {
    public static double CI(double principle, double rate, double time){
        double temp = 1 + (rate/100);
        double CI = principle * Math.pow(temp, time);
        return CI;
    }
  public static void main(String args[]){
    double Principle, Time, Rate;
    double CI;
    Scanner Scan = new Scanner(System.in);
    System.out.println("Enter principle amount: ");
    Principle  = Scan.nextDouble();
    System.out.println("Enter time (years): ");
    Time = Scan.nextDouble();
    System.out.println("Enter rate: ");
    Rate = Scan.nextDouble();
    CI = CI(Principle, Rate, Time);
    System.out.println("Coumpound Intrest: " + CI);
    Scan.close();


  }  
}
