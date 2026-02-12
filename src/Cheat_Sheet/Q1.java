package Cheat_Sheet;

import java.util.Scanner;

public class Q1 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i = 1; i <= n; ++i)
        {
            for(int k = 0; k < n - i; ++k)
                System.out.print(" ");
            for(int j = 1; j <= 2*i - 1; ++j)
                System.out.print("*");
            System.out.println();
        }
        for(int i = n-1; i >= 1; --i)
        {
            for(int k = 0; k < n - i; ++k)
                System.out.print(" ");
            for(int j = 1; j <= 2*i - 1; ++j)
                System.out.print("*");
            System.out.println();
        }
    }
}
