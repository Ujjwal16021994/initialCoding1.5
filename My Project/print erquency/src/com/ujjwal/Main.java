package com.ujjwal;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = new int[]{2,6,2,5,2,3,4,2,1,5,4,2,1,2,1,4,5};
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i< array.length;i++)
        {
            if(hashmap.containsKey(array[i]))
            {
                int x = hashmap.get(array[i]);
                x++;
                hashmap.put(array[i],x);
            }
            if(!hashmap.containsKey(array[i]))
            {
                hashmap.put(array[i],1);
            }
        }
        for(int i : hashmap.keySet())
        {
            System.out.print(i+" : "+hashmap.get(i)+"  --,--  ");
        }
    }
}
