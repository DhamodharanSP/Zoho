package Cheat_Sheet;

import java.util.Scanner;
import java.util.Stack;

public class Q26
{
    static int index = 0;
    public static String solveRecursive(String s)
    {
        String res = "";
        int k = 0;
        while(index < s.length() && s.charAt(index)!=']')
        {
            char cur = s.charAt(index);
            if(Character.isDigit(cur))
            {
                k = 0;
                while(index < s.length() && Character.isDigit(s.charAt(index)))
                {
                    k = k * 10 + ((int)(s.charAt(index) - '0'));
                    index++;
                }

            }
            else if(Character.isLetter(cur))
            {
                if(k == 0) res += cur;
                else res += (cur+"").repeat(k);
                k = 0;
                index++;
            }
            else if(cur == '[')
            {
                index++;
                String recur = solveRecursive(s);
                if(k == 0) res += recur;
                else res += recur.repeat(k); // edge case of k == 0
                k = 0;
                index++;
            }
            else if(cur == ']')
            {
                if(k == 0) res += cur;
                else res += (cur+"").repeat(k);
                k = 0;
                index++;
            }
        }
        return res;
    }

    public static String solveStack(String s)
    {
        Stack<Integer> count = new Stack<>();
        Stack<String> strings = new Stack<>();
        String cur = "";
        int k = 0;
        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                k = k * 10 + (ch - '0');
            }
            else if(Character.isLetter(ch))
            {
                if(k == 0) cur += ch;
                else cur += (ch+"").repeat(k);
                k = 0;
            }
            else if(ch == '[')
            {
                count.push(k);
                strings.push(cur);
                k = 0;
                cur = "";
            }
            else if(ch == ']')
            {
                String prev = strings.pop();
                int c = count.pop();
                if(c != 0) cur = cur.repeat(c);
                cur = prev + cur;
            }
        }
        return cur;
    }

    static void main() {
        Scanner in = new Scanner(System.in);
        // 3[a2[c]]
        // 2a3bc
        // 3x2[y]
        // 2[a2[b]]
        String s = in.next();
        index = 0;
        System.out.println(solveRecursive(s)); // using Recursion
        System.out.println(solveStack(s)); // using Stack
    }
}
