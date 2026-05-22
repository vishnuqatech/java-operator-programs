import java.util.*;
public class CheckMultiple30{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int num=s.nextInt();
 
if((num%3==0) && (num%5==0)){
System.out.println("is a Multiple of number ");
}else{
System.out.println("is a Not  Multiple of number ");
}

}
}