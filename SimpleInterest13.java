import java.util.*;
public class SimpleInterest13{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter amount of principal ");
int p=s.nextInt();
System.out.println("enter the rate of percetange");
int r=s.nextInt();
System.out.println("time ");
int t=s.nextInt();
//double  a= p *Math.pow((1 +  r  /  100), t) ;
double a = p * Math.pow((1 + r / 100.0), t);
double  ci =a-p;
System.out.println("total ci "+ a);
System.out.println("compund interest "+ci);

}
}