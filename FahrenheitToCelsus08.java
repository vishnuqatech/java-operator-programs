import java.util.*;
public class FahrenheitToCelsus08{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("Enter the value of celcus ");
int  cel =s.nextInt();
double fahrenheit=( cel * 9 / 5) + 32;
System.out.println("fahrenheit "+ fahrenheit);
}
}
