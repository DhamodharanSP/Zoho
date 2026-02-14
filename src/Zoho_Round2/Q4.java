package Zoho_Round2;

import java.util.Scanner;

public class Q4
{
    public static int binaryToDecimal(int n)
    {
        int pow = 0, sum = 0;

        while(n > 0)
        {
            int rem = n%10;
            if(rem == 1)
            {
                sum = sum + (int)Math.pow(2, pow);
            }
            pow++;
            n = n/10;
        }
        return sum;
    }

    public static int decimalToBinary(int n)
    {
        // 8  => 1000
        int res = 0;
        int count = 0;
        while(n > 0)
        {
            int rem = n%2;
            res = res*10 + rem;
            n = n/2;
            count++;
        }

        // count = 4
        // 0001  => 1
        //             1,   4    => 1 * (10^3)
        return reverse(res, count);

        // 1000
    }
                        //       1,     4
    public static int reverse(int n, int count)
    {
        int res = 0;
        int c = 0;
        while(n > 0)
        {
            res = res*10 + n%10;
            n /= 10;
            c++;
        }
        // res = 1, c = 1

        // 0001 => 1
        if(count != c) //  4 != 1  ;  With this check, we solve the issue of trailing zeros in numbers after reversing
        {
            int remain = count - c;          // 4 - 1 = 3
            res = res * (int)Math.pow(10, remain);  // res = 1 * (10^3) =? 1000
        }
        return res; // 1000
    }

    static void main() {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();  //  1 0 1 => 5
        int b = in.nextInt();  //    1 1 => 3

        int aBin = binaryToDecimal(a);
        int bBin = binaryToDecimal(b);

        System.out.println(aBin+", "+bBin);

        int decimalSum = aBin + bBin;

        int binarySum = decimalToBinary(decimalSum);

        System.out.println(binarySum);
    }

}








//   5 =>  1 0 1

// 31 30 ...  2 1 0
// 0 0 0 ...  1 0 1

// 2^0 => 1
// 2^1
// 2^2 => 4

// pow = 2, sum = 5;










// 16 8 4 2 1
//  0 0 1 0 1



// 5 + 3 => 8

// 101 + 11 => 1000








// 5 -> 1 0 1

// val = 5
// val = val/2;
// 5/2 => rem = 1, val = 2
// 2/2 => rem = 0, val = 1
// 1/2 => rem = 1, val = 0

// 1 1 0 1 -> 13


// 13/2 => val = 6, rem = 1
// 6/2  => val = 3, rem = 0
// 3/2  => val = 1, rem = 1
// 1/2  => val = 0, rem = 1


// 1011 -> 1101




