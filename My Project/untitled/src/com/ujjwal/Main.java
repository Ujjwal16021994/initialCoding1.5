package com.ujjwal;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 6, 4, 2, 7, 4, 2, 3, 9, 2, 8, 4};
        Map<Integer, Integer> has = new HashMap<>();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (has.containsKey(array[i])) {
                int x = has.get(array[i]);
                x++;
                has.put(array[i], x);
            }
            if (!has.containsKey(array[i])) {
                has.put(array[i], 1);
            }
        }
        int count = 0;
        int maxcount = 0;
       for(Map.Entry<Integer,Integer> sone : has.entrySet())
       {
           if(sone.getValue()>count)
           {
               count = sone.getValue();
           }
           if(sone.getValue()==count)
           {
                if()
           }
       }

    }
}