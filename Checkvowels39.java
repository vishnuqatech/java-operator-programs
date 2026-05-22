import java.util.*;
public class Checkvowels39{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
//char  ch=s.next().chaAt(0);
 char ch = s.next().charAt(0);
 ch=Character.toLowerCase(ch);
 
 if(ch>='a' && ch<='z'){
if( (ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u' )){
 System.out.println("the vowels ");
}else{
	 System.out.println("the consonant ");
 }
 }
 else{ 
 System.out.println("invalid input ");
 }
 
 
}
}