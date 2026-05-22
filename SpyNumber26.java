import java.util.*;
public class SpyNumber26{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();
int sum=0;
int prod=1;
while(num>0){
int digit=num%10;
sum =sum + digit;
prod=prod * digit;
num=num/10;
}
System.out.println(" the sum of number is  : " + sum );
System.out.println("prod  of number is      :" + prod);
if(sum==prod){
	System.out.println("This is a Spy Number ");
}else{
	System.out.println("This is not Spy Number ");
}

}
}