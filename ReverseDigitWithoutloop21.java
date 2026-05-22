import java.util.*;
public class ReverseDigitWithoutloop21{
public static int reverse(int num,int rev){
if(num==0){
return rev ;
}
return reverse(num/10,rev*10+(num%10));
}
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();
int result=reverse(num,0);
System.out.println("result ="+result );
}
}