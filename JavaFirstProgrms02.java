import java.util.*;
public class JavaFirstProgrms02{
public static void main(String args[] ){
Scanner s=new Scanner(System.in);
System.out.println("Enter the integer value");
int a=s.nextInt();

System.out.println("Enter the String value");
String str=s.next();

System.out.println("Enter the ch value");
char  ch=s.next().charAt(0);

System.out.println("Enter the float value");
float f=s.nextFloat();

System.out.println("Enter the double value");
double d=s.nextDouble();

System.out.println("Enter boolean  value");
boolean b=s.nextBoolean();

System.out.println("Display the enter  values");

System.out.println(a);
System.out.println(str);
System.out.println(ch);
System.out.println(f);
System.out.println(d);
System.out.println(b);



}
}