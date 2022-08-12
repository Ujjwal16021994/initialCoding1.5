import java.oi;
import java.util.*;
public static int[] arr(int[] array,int length) {
    int x = array[length];
    for(int i=0;i<length;i++)
        {
            if(array[i]>x)
        {
            for(int j=i;j<length-1;j++)
        {
            int temp = array[i];
            array[i] = array[i+1];
            array[i+1] = array[i];
        }
        }
        }
        }
arr = {2,5,6,8,5,2,1,6,8,4,6,7,3}
int len = arr.length;
shortit(arr,len);