import java.util.*;
public class MaxiMumnumber41{
public static void main(String args[] ){
Scanner s=new Scanner(System.in);
System.out.println("Enter anuy number ");
int a=s.nextInt();
System.out.println("Enter anuy number ");
int b=s.nextInt();
System.out.println("Enter anuy number ");
int c=s.nextInt();
String result = a<b || c<b ?"B is maximize number  " : " b is minimize number";
System.out.println(result);


}
}