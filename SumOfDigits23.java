import java.util.*;
public class SumOfDigits23{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();
int first=num/100;
int last=num%10;
int sum=first+last;

System.out.println("sum " + sum);
}
}