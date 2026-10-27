class lakshu{
public static void main(String[] args){
int arr[]={5,3,-1,2,1,8};
boolean check[]=new boolean[arr.length+1];
check[0]=true;
for(int i=0;i<arr.length;i++){
if(arr[i]>0&& arr[i]<=arr.length){
check[arr[i]]=true;
}
}
for(int i=0;i<=check.length;i++){
if(!check[i]){
System.out.println(i);
break;
}
}
}
}
