package mid;

import java.util.*;

public class _260 {
    public static void main(String[] args){
        for (int i : singleNumber(new int[]{1,2,1,3,2,5})){
            System.out.println(i);
        };
    }
    public static int[] singleNumber(int[] nums) {
        if(nums.length == 2 ) return nums;
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int[] rs = new int[2];

        int tem = 0;
        for (int i : nums){
            tem ^= i;
        }
        int idx = 1;
        while(idx < tem){
            if((tem & idx )== idx) break;
            idx <<= 1;
        }
        
        for(int i : nums){
            if((i & idx)==idx){
                a.add(i);
            }else{
                b.add(i);
            }
        }

        for(int i : a){
            rs[0] ^= i;
        }

        for(int i : b){
            rs[1] ^= i;
        }
        return rs;
    }
}
