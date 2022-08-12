package com.ujjwal;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> set = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='(')
            {
                set.push('(');
            }
            if(str.charAt(i) ==')')
            {
                if(set.peek()=='(')
                {
                    set.pop();
                }
            }
            if(str.charAt(i)!='(' ||str.charAt(i)!=')')
            {
                System.out.println("not valid");
                return;
            }
        }
        if(set.empty()==true)
        {
            System.out.println("valid combination");
        }
        else
        {
            System.out.println("not valid combination.... sorry");
        }

    }
}
