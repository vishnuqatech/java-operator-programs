import java.util.*;
public class ConvertSecMinutes17{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("enter any Seconds  ");
int totalsec=s.nextInt();

// in 1 hrs=3600sec;
//in 1 min=60 sec;

int hrs=totalsec/3600;
int remaining =totalsec%3600;

int min=remaining/60;
int sec=remaining%60;

System.out.println("hrs "+hrs +"  min " + min + " seconds " + sec );

}
}
