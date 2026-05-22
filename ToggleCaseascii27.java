import java.util.*;
public class ToggleCaseascii27{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
char ch =s.next().charAt(0);

  ch=(char) (ch^32);
System.out.println(ch);
}
}
