package Zoho_Round2;

public class Q3
{
    static void main() {
        int[] a = {2,3,6,7,9};
        int[] b = {1,4,8,10,11,12,15};
        int k = 13;

        if(k > a.length + b.length)
        {
            System.out.println(-1);
            return;
        }

        int i = 0, j = 0, moves = 0;
        while(i < a.length && j < b.length)
        {
            if(a[i] < b[j])
            {
                moves++;
                if(moves == k)
                {
                    System.out.println(a[i]);
                    return;
                }
                i++;
            }
            else if(a[i] > b[j])
            {
                moves++;
                if(moves == k)
                {
                    System.out.println(b[j]);
                    return;
                }
                j++;
            }
        }

        while(i < a.length)
        {
            moves++;
            if(moves == k)
            {
                System.out.println(a[i]);
                return;
            }
            i++;
        }

        while(j < b.length)
        {
            moves++;
            if(moves == k)
            {
                System.out.println(b[j]);
                return;
            }
            j++;
        }

    }
}

//              i
// a -> 2 3 6 7 9
// b -> 1 4 8 10 11 12 15
//                         j

//   b[j] < a[i] => j++; moves++; if(moves == k) return a[i]
//   b[j] > a[i] => i++; moves++; if(moves == k) return b[j]
//   a[i] == b[j] => i++;

//                                 k(13)
// c => 1 2 3 4 6  6 7 8 9 10 11 12 15