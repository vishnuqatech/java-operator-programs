import java.util.*;
public class FahrenheitToCelsus07{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("Enter fahrenheit ");
int   f=s.nextInt();
double celcus=(f-32)*5/9;
System.out.println("celcus" + celcus );
}
}
