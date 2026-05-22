import java.util.*;
public class Checkspecialsymbol40{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any number");
//int num=s.nextInt();
 char ch = s.next().charAt(0);
 String result=( (ch>='a' && ch<='z' ) ||  (ch>='A' && ch<='Z' ) ) ?"Aplhabtes ":
(ch>=0 && ch<=9 )? "number ": "Special symbol";
 System.out.println(result);
 /*if( (ch>='a' && ch<='z' ) ||  (ch>='A' && ch<='Z' ) ) {
 System.out.println("this is alphabets ");
 }else if(ch>=0 && ch<=9 ){
  System.out.println("this is number ");
  }else{
  System.out.println("this is a special symbol ");
  }
  */
  }
  }
