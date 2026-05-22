import java.util.*;
public class CheckAlphabet36{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
//char  ch=s.next().chaAt(0);
 char ch = s.next().charAt(0);

if(ch>='a' && ch<='z' ){
System.out.println("lowercase alphabetes ");
}else if(ch>='A' && ch<='B' ){
System.out.println("uppercase alphabetes ");
}else{
System.out.println("there is not aplhabtes ");
}

}
}
