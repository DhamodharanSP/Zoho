package Zoho_Round2;

import java.util.Scanner;

public class Q1
{
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int start = 0;

        for(int i = 0; i < n; i++)
        {
            start = start + i + 1;
            for(int k = 0; k < i; k++)
            {
                System.out.print("  ");
            }
            int val = start;
            int add = i + 1;
            for(int j = 0; j < n - i; j++)
            {
                System.out.print(val+" ");
                val = val + add;
                add++;
            }
            System.out.println();
        }
    }
}

















// n = 5

// val = 7

// val = start
// val + add
// add++

//             val = 16 , add = 6

//             val = val + add
//             add = add + 1

 //  0 1 2 3  4   // 0 => start = start + (i + 1)
//0  1 2 4 7 11   // +1
//1    3 5 8 12   // +2
//2      6 9 13   // +3
//3       10 14   // +4
//4          15   // +5


// n: 1 -> 15



// row - i, col - j, space - k

// * * * * *
// _ * * * *
// _ _ * * *
// _ _ _ * *
// _ _ _ _ *

// 0 based indexing