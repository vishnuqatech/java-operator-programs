import java.util.*;
public class JavaFirstProgrms03{
public static void main(String args[] ){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number first");
int a=s.nextInt();
System.out.println("Enter the number Seconds");
int b=s.nextInt();

int sum=a+b;
System.out.println("addition = "+sum);
int sub=a-b;
System.out.println("sub  = "+sub);
int mul=a*b;
System.out.println("mul  = "+mul);
int div=a/b;
System.out.println("div  = "+div);
int mod=a%b;
System.out.println("mod  = "+mod);

}
}