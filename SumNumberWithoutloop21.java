import java.util.*;
public class SumNumberWithoutloop21{
public static int SumofNumber(int num,int sum){
//if(num==0){
//return sum;
//}
return sum;
return SumofNumber(num/10,  sum + ( num % 10 ) );
}
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();
int result= SumofNumber(num,0);
System.out.println("result  " + result );
}
}