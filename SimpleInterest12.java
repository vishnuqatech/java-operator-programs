import java.util.*;
public class SimpleInterest12{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter amount of principal ");
int p=s.nextInt();
System.out.println("enter the rate of percetange");
int r=s.nextInt();
System.out.println("time ");
int t=s.nextInt();
int si=p*r*t/100;
System.out.println("simple interest "+si);
}
}