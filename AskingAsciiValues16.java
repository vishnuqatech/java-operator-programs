import java.util.*;
public class AskingAsciiValues16{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any charcter   ");
char ch=s.next().charAt(0);
int ascii=(int) ch;
System.out.println("ascii values " + ascii );

}
}