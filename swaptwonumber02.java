import java.util.*;
public class swaptwonumber02{
public static void  swaptwonumber(int a,int b,int temp){
System.out.println("before swapping ");
System.out.println("before swaping a  ="+ a );
System.out.println("after swaping b= " + b);

int temp=a;
a=b;
b=temp;
System.out.println("after swapping ");
System.out.println("after swaping a  ="+ a );
System.out.println("after swaping b= " + b);
}
public static void main (String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("Enter any num1 ");
int num1=s.nextInt();
System.out.println("Enter any num2 ");
int num2=s.nextInt();
 int result =swaptwonumber(num1,num2);
System.out.println("result "+ result);


}
}