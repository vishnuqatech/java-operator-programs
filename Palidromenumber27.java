import java.util.*;
public class Palidromenumber27{
public static void palidromenum(int num){
int original=num;
int rev=0;
while(num>0){
	int digit=num%10;
	rev=rev*10+digit;
	num=num/10;
}

if(original==rev){
	System.out.println("is a palidrome number ");
}else{
	System.out.println("Is a not palidrome number ");
}


}
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();
int rev=0;
 palidromenum(num);

}
}