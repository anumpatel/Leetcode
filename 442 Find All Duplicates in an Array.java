public class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ret = new ArrayList<Integer>();
        if(nums.length == 0)
            return ret;
        Arrays.sort(nums);
        
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] - nums[i+1] == 0)
                ret.add(nums[i+1]);
        }
        return ret;
    }
}