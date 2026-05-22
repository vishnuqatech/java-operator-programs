import java.util.*;
public class SumOfDigits20{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();
int sum=0;
while(num>0){
int remainder=num%10;  // we get last digit 
sum=sum+remainder;
num=num/10;  // we remove last digit
}
System.out.println("sum  ="+sum);

}
}