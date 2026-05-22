import java.util.*;
public class Secondmax01{
public static void main(String args[] ){
Scanner s= new Scanner(System.in);
System.out.println("Enter size of arrays");
int size=s.nextInt();
int a[]=new int[size];
System.out.println("enter the arrays values");

for(int i0;i<size;i++){
a[i]=s.nextInt();
}
int first=Integer.MIN_VALUE;
int second=Integer.MIN_VALUE;

for(int i=0;i<size;i++){
if(a[i]>first){
second=first;
second=a[i];
}else if (a[i] > second && a[i] != first){
second=a[i];
}
}

System.out.println("second highest max " +second);

}
}