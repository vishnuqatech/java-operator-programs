import java.util.*;
public class NeonNumUsingRecursionVoid24{
int sum=0;
public static void  neonNum(int n ){
if(n==0){
return ;
}
sum +=n % 10;
neonNum(n/10);
}
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();
int sqaure=num*num;
int sum=0;
neonNum(sqaure);

if(sum==num){
System.out.println("Is neon Number ");
}else{
System.out.println("Is Not neon Number ");
}

}
}