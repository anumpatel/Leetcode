public class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        /*int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int s=nums.length;
        return s*(s+1)/2-sum;*/
        if(nums[0] != 0)
            return 0;
        int i=1;
        for(i=1;i<nums.length;i++){
            if(nums[i] - nums[i-1] != 1)
                return i;
        }
        return i;
    }
}