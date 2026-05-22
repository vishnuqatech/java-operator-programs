import java.util.*;
public class Divisor29{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter dividend number ");
int dividend=s.nextInt();
System.out.println("Enter divisor");
int divisor = s.nextInt();
int quotient = dividend/divisor;
int remainder=dividend%divisor;
System.out.println("quotient  ="+ quotient );
System.out.println("remainder ="+ remainder );

}
}