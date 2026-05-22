import java.util.*;
public class SumOfDigits22{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();         //456

/*int last=num%10;  
num=num/10;
num=num/10;
int first=num%10;
num=num/10;
*/

int first=num/100;
int last =num%10;
System.out.println("first "+first);
System.out.println("last " + last );

}
}