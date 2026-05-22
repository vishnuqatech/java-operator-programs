import java.util.*;
public class SumOfDigits21{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();
int rev=0;
while(num>0){
int rem=num%10;
rev=rev*10+rem;
num=num/10;
}
System.out.println("rev"+rev);
}
}