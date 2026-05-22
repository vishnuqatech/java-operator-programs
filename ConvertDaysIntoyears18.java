import java.util.*;
public class ConvertDaysIntoyears18{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter totaldays  ");
int totaldays=s.nextInt();
int years=totaldays/365;
int remainingdays=totaldays%365;
int month=remainingdays/28;
remainingdays=remainingdays%28;
int week=remainingdays/7;
int days=remainingdays%7;

System.out.println("years " + years + " month " + month +"week "+week + "days =" + days );

}
}
