import java.util.*;
public class CheckMultiple32{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
int angle1=s.nextInt();

System.out.println("enter any number");
int angle2=s.nextInt();

System.out.println("enter any number");
int angle3=s.nextInt();

//int final =angle1+angle2+angle3;

if(angle1+angle2+angle3==180){
System.out.println("Is valid traingle ");
}else{
System.out.println("Is a not traingle ");
}

}
}