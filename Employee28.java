import java.util.*;
public class Employee28{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter basic ");
int basic=s.nextInt();
System.out.println("enter basic ");
int HRA=s.nextInt();
System.out.println("enter ba ");
int DA=s.nextInt();
System.out.println("enter tax  ");
int Tax=s.nextInt();

double  hra=basic*HRA/100;
double da=basic*DA/100;
double tax=basic*Tax/100;
int  netsalary=basic+hra+da-tax;
System.out.println("netsalary " + netsalary );
}
}