package com.ujjwal;

public class Main {
    public static int check(int[] array,int start,int end) {
        int mid = start + (end - start +1)/2;
        if(array[mid]>array[mid+1] && array[mid]>array[mid-1])
        {
            return mid;
        }
        if(array[mid]>array[mid+1] && array[mid]<array[mid-1])
        {
            return check(array,start,mid);
        }
        if(array[mid]<array[mid+1] && array[mid]>array[mid-1])
        {
            return check(array,mid,end);
        }
        return -1;
    }

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[] {1,2,3,2,1};
        int index = check(array,0,array.length);
        System.out.println(array[index]);
    }
}
