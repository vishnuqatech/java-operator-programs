import java.util.*;
public class EvenOddnumber33{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int a=s.nextInt();

System.out.println("enter any number");
int b=s.nextInt();

System.out.println("enter any number");
int c=s.nextInt();

if(a==b && b==c && c==a){
System.out.println("is a equilateral ");
}else{
System.out.println("is not a equilateral ");
}

}
}