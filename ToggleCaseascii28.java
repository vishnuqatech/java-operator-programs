import java.util.*;
public class ToggleCaseascii28{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
char ch =s.next().charAt(0);

if(ch>='a' && ch<='z'){
ch=(char) (ch-32);
}else if (ch>='A' && ch<='Z' ){
ch=(char) (ch-32);
}else{
System.out.println("this is a not alpahbets ");
}

System.out.println("return the toggle " +  ch );
}
}