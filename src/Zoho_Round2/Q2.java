package Zoho_Round2;
import java.util.*;
public class Q2
{
    static void main() {
        int[] nums = {1,1,2,2,2,2,4,5,5,5,5,10,10,22};  //  constraints: 0 < nums[i] < 10^9 ,  nums.length < 100
        int freq = 3;

        int size = 0;

        for(int i : nums)
        {
            size = Math.max(size, i);
        }

        int[] freqArray = new int[size+1];  // SC: O(1)

        for(int i : nums)
        {
            freqArray[i]++;
        }

        System.out.println(Arrays.toString(freqArray));

        for(int i = 0; i < size+1; ++i)
        {
            if(freqArray[i] > freq)
                System.out.println(i+" : "+freqArray[i]);
        }


//        HashMap<Integer, Integer> map = new HashMap<>();

//        for(int num : nums)
//        {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//
//        System.out.println(map);
//
//        for(int key : map.keySet())
//        {
//            if(map.get(key) > freq)
//                System.out.println(key+": "+map.get(key));
//        }
    }

}


//Arr{1,1,2,2,2,2,4,5,5,5,5,10,10,22}

//Freq = 3
//O/p
//2->4, 5->4

//If Freq =1
//O/P
//1->2   2->4   5->4   10->2