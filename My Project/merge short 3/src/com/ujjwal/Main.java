package com.ujjwal;
public class Main {
    public static void merge(int[] array,int start,int mid,int end) {
        int[] newarray = new int[end-start+1];
        int i=start,j=mid+1,k=0;
        while (i<=mid && j<=end)
        {
            if(array[i]<=array[j])
            {
                newarray[k++] = array[i++];
            }
            else
            {
                newarray[k++] = array[j++];
            }
        }
        while(i<=mid)
        {
            newarray[k++] = array[i++];
        }
        while (j<=end)
        {
            newarray[k++] = array[j++];
        }
        int q;
        int r;
       for(q=start,r=0;r< newarray.length;q++,r++)
        {
            array[q] = newarray[r];
        }
    }
    public static void divide(int[] array,int start,int end) {
        if(start>=end)
        {
            return;
        }
        int mid = start + (end-start)/2;
        divide(array,start,mid);
        divide(array,mid+1,end);
        merge(array,start,mid,end);
    }
    public static void main(String[] args) {
        int[] array = new int[] {10,80,60,50,40,90,70,30,20};
        int n =array.length;
        divide(array,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
}
