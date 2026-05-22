import java.util.*;
public class Matrixpattern01{
public static void main(String args[] ){

for(int i=1;i<=5;i++){
for(int j=1;j<=5;j++){
      if(j==1 || i == 5 || j==6-i || j==5 || i==1){              // we can use  j>=i
System.out.print("*");
}else{
	System.out.print("");
}
}
System.out.println(" " );
}

}
}