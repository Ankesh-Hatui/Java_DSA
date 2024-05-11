// increasing-triplet-subsequence
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int leftMin[]=new int[nums.length];
        int rightMax[]=new int[nums.length];
        int mini=Integer.MAX_VALUE;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            leftMin[i]=Math.min(nums[i],mini);
            mini=Math.min(nums[i],mini);
        }
        for(int i=nums.length-1;i>=0;i--){
            
            rightMax[i]=Math.max(nums[i],maxi);
            maxi=Math.max(nums[i],maxi);
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>leftMin[i] && nums[i]<rightMax[i]){
                return true;
            }
        }
        return false;
    }
}
