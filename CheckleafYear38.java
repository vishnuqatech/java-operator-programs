import java.util.*;
public class CheckleafYear38{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();

String result=num%4==0?"leaf year":" Not leaf year ";
System.out.println(result);

}
}