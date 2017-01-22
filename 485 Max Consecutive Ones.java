public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return 0;
        int cnt = 0,max =0;
        for(int i=0;i<len;i++){
            if(nums[i] == 1){
                cnt++;
            }
            if(max < cnt)
                max = cnt;
            if(nums[i] == 0)
                cnt = 0;
        }
        return max;
        
    }
}