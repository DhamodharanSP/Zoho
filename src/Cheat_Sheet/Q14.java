package Cheat_Sheet;

public class Q14
{
    // Two sorted arrays are given. One array has exactly one extra element. Find that element and its index.
    static void main()
    {
//        int[] a = {1, 3, 5, 7, 9, 11};
//        int[] b = {1, 3, 4, 5, 7, 9, 11};

        int[] a = {2, 4, 6, 7, 8, 10};
        int[] b = {2, 4, 7, 8, 10};
        // binary search - if current sequence is same, then there is no extra elements in left side. But, if they are mismatched, then there must be an extra element in the left

        int aLen = a.length, bLen = b.length;
        int l = 0, r = Math.min(aLen, bLen);
        int index = r+1;
        while(l <= r)
        {
            int mid = (l + r)/2;
            if(a[mid] == b[mid])
                l = mid+1;
            else
            {
                index = mid;
                r = mid-1;
            }

        }
        int val = -1;
        if(aLen < bLen)
            val = b[index];
        else val = a[index];
        System.out.printf("i: %d => %d", index, val);
    }
}