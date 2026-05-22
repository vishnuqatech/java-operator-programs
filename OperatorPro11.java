import java.util.*;
public class OperatorPro11{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter the subjects marks");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
int e=s.nextInt();

int total=a+b+c+d+e;
int percentage=total/5;

System.out.println("total  = "+total);
System.out.println("percentage = "+percentage);
}
}