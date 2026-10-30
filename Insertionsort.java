import java.util.Arrays;
class Main{
    public static void main(String[]args){
            int[] arr={5,3,4,1,2};
            for(int i=1;i<arr.length-1;i++){
                    int key=arr[i];
                    int j=i-1;
                    while(j>=0&&arr[j]>key)
                    {
                            
                            arr[j+1]=arr[j];
                            j--;
                    }
                            arr[j+1]=key;
            }
                    System.out.println("sorted Array");
                    System.out.println(Arrays.toString(arr));
    }
}