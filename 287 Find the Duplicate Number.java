public class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return 0;
        Arrays.sort(nums);
        
        int res = 0;
        for(int i=0;i<len-1;i++){
            if(nums[i] - nums[i+1] == 0)
                res = nums[i];
        }
        return res;
        
    }
}