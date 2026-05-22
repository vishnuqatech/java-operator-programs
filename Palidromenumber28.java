import java.util.*;
public class Palidromenumber28{
public static void palidromenum(int num){
int original=num;
int rev=0;
while(num>0){
	int digit=num%10;
	rev=rev*10+digit;
	num=num/10;
}
retrun rev;
}
//public static boolean isPalidrome(int num){
//return num=palidromenum(num);
//}
public static boolean isPalidrome(int num) {
  return num == palidromenum(num);  // ✅ comparison
    }


public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();
if(isPalidrome(num)){
System.out.println("Is prime number" );
}else{
System.out.println("Is not prime number ");
}

}
}