package com.ujjwal;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        String str = sc.nextLine();
        int length = str.length();
        for(int i=0;i<length;i++)
        {
            if(!set.contains(str.charAt(i)))
            {
                set.add(str.charAt(i));
            }
            else
            {
                System.out.print(str.charAt(i)+"  ");
            }
        }
    }
}
