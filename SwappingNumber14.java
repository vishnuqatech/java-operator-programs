import java.util.*;
public class SwappingNumber14{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter first number  ");
int a=s.nextInt();
System.out.println("enter the second number ");
int b=s.nextInt();
System.out.println("before swapping number a ="+ a);
System.out.println("before swapping number b ="+ b);
int temp=a;
a=b;
b=temp;

System.out.println("after swapping number a  ="+ a);
System.out.println("after  swapping number b  ="+ b);
}
}