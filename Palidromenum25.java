import java.util.*;
public class Palidromenum25{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();
int n=num;
int rev=0;

while(num>0){
int rem=num%10;
rev=rev*10+rem;
num=num/10;

}
if(rev==n){
System.out.println("palidrome ");
}else{
System.out.println(" Is not palidrome ");
}

}
}
