package com.ujjwal;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(11);
        list.add(9);
        list.add(4);
        list.add(7);
        int target = 4;
        for(int i=0;i< list.size();i++)
        {
            if(list.contains(4- list.get(i)))
                System.out.println("it contains the pair "+list.get(i)+" "+(4-list.get(i)));
            if(list.contains( list.get(i)-4))
                System.out.println("it contains the pair "+list.get(i)+" "+(list.get(i)-4));
        }
    }
}
