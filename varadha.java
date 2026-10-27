import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner Scan=new Scanner(System.in);
        int arr[]={10,20,10,40,20,20,10};
        int key=Scan.nextInt();
        boolean found=false;
        for(int i:arr){
        if(key==i)
        found=true;
        }
        System.out.println(found);
    }
}