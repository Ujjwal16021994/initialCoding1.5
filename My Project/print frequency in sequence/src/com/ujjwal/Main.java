package com.ujjwal;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = new int[] {2,9,7,2,9,2};
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i< arr.length;i++)
        {
            if (hmap.containsKey(arr[i]))
            {
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }
            else
            {
                hmap.put(arr[i],1);
            }
        }
        for (int i=0;i<hmap.size();i++)
        {
            System.out.println(arr[i]+" -> "+hmap.get(arr[i]));
        }
    }
}
