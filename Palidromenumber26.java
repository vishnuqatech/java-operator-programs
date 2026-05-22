import java.util.*;
public class Palidromenumber26{
public static int palidrome(int num,int rev){
if(num==0){
return rev;
}
return palidrome((num /10),(rev*10+(num%10)));
}
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();
 int result= palidrome(num,0);
if(result== num){
	System.out.println("is a palidrome number ");
}else{
	System.out.println("Is a not palidrome number ");
}

}
}