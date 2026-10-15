import java.util.*;
class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int k=1;
int space=a/2;
for(int i=0;i<a;i++){
for(int j=0;j<space;j++){
System.out.print(" ");
}
for(int j=0;j<k;j++){
System.out.print("*"+ "  ");
}
k+=i<a/2?2:-2;
space+=i<a/2?-1:1;
System.out.println();
}
}
}


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               