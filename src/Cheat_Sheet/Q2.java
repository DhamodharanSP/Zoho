package Cheat_Sheet;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Q2
{
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; ++i)
            nums[i] = in.nextInt();

        // Collections
        Set<Integer> set = new LinkedHashSet<>();
        for(int num : nums)
            set.add(num);

        for(int num : set)
            System.out.print(num+" ");

        System.out.println();

        // Visited array (only for +ve nums)
        int size = 0;
        for(int num : nums)
            size = Math.max(size, num);

        boolean[] seen = new boolean[size+1];
        for(int num : nums)
            seen[num] = true;

        for(int i = 0; i <= size; ++i)
        {
            if(seen[i])
                System.out.print(i+" ");
        }
    }
}
