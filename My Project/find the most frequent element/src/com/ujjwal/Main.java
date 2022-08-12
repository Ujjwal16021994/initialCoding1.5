package com.ujjwal;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[] {-1,-1,0,0,0,0,-1,-1,-1};
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i=0;i< array.length;i++)
        {
            if(set.containsKey(array[i]))
            {
                set.put(array[i],set.get(array[i])+1);
            }
            else
            {
                set.put(array[i],1);
            }
        }
        int max = Integer.MIN_VALUE;
        int value=0;
        for (int i : set.keySet())
        {
            if(set.get(i)>max)
            {
                max = set.get(i);
                value = i;
            }
        }
        System.out.println(value);
    }
}
