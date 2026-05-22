import java.util.*;
public class Palidromenumber25{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();
int temp=num;
int rev=0;

while(num>0){
int digit=num%10;
rev=rev*10+digit;
num=num/10;

}

if(temp==rev){
System.out.println("Is a palidrome number ");
}else{
System.out.println("Is not palidrome number ");
}
}
}