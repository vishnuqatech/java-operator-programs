import java.util.*;
public class NeonNumber24{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();
int sum=0
while(num>0){
int digit =num%10;
sum+=digit;
num=num/10;
}

if(num==sum){
System.out.println("Is A neon number ");
}else{
System.out.println("Is A neon number ");

}

}
}
