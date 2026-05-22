import java.util.*;
public class CheckDivisible37{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int costp=s.nextInt();
System.out.println("enter any number");
int cellp=s.nextInt();
//String result = cellp>costp?"progit":"loss";
//System.out.println(result);

if(costp<cellp){
	System.out.println("profit");
}else{
		System.out.println("loss");
}
}
}