import java.util.*;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int a= scan.nextInt();
for(int i=1;i<a;i++){
for(int b=1;b<=i;b++){
System.out.print(b+" ");
}
System.out.println();
}
}
}