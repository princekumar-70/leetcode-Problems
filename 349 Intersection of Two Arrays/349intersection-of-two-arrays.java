import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] ans = new int[nums1.length];
        int k = 0;
        int i = 0, j = 0;

        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
              
                ans[k++] = nums1[i];

                int val = nums1[i];

              
                while(i < nums1.length && nums1[i] == val) i++;

               
                while(j < nums2.length && nums2[j] == val) j++;

            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
           int[] result = new int[k];
            for(int p=0;p<k;p++){
               result[p] = ans[p];
           }
             return result;

        
    }
}