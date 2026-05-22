import java.util.*;
public class JavaFirstProgrms05{
public static void main(String args[] ){
Scanner s=new Scanner(System.in);
System.out.println("Enter the length of rectangle");
int r=s.nextInt();

//int pi=3.14;
double  diameter=2*r;
double area =3.14*r*r;
double circuumatance=2*3.14*r;

System.out.println("diameter  := "+diameter);
System.out.println("area := "+area);
System.out.println("circuumatance = " +circuumatance);
}
}