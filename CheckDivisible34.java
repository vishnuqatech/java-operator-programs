import java.util.*;
public class CheckDivisible34{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();

if((num%5==0) && (num%11==0) ) {
System.out.println("both are divisible of 55");
}else{
System.out.println("Both are not divisible of of 55 ");
}
}
}