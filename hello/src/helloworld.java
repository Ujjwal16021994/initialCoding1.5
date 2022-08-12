import java.util.HashMap;
import java.util.Scanner;

public class helloworld{
    public static void concur(int[] arr,int start,int  mid,int end) {
        int i=0,j=0,k=0;
        int[] merged = new int[end+1];
        int a=mid+1;
        int b=end-mid+1;
        while(i<a && j<b)
        {
            if(arr[i]>arr[j])
            {
                merged[k] = arr[j];
                j++;
            }
            else
            {
                merged[k] = arr[i];
                i++;
            }
            k++;
        }
        while(i<=a)
        {
            merged[k] = arr[i];
                       i++;
                       k++;
        }
        while(j<=b)
        {
            merged[k] = arr[j];
            j++;
            k++;
        }
        for(int p=0,q=0;p<merged.length;p++,q++)
        {
            arr[q] = merged[p];
        }
    }
    public static void divide(int[] arr,int start,int end) {
        if(start>=end)
        {
            return;
        }
        int mid = start + (end-start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        concur(arr,start,mid,end);
    }
    public  static  void main(String args[]){
        int[] arr = new int[] {1,5,8,7,5,6,4,5,6,4,5,9,1,2,6};
        for(int i : arr)
            System.out.print(arr[i]);
        divide(arr,0,arr.length-1);
        System.out.println();
        for(int i : arr)
        System.out.print(arr[i]);
    }
}
