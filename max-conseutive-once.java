class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int max=0,current=0;
       for(int i=0;i<nums.length;i++){
        current=0;
        for(int j=i;j<nums.length;j++){
            if(nums[j]==0)
            break;
            current++;

        }
        max=Math.max(max,current);

        }
        return max;
       }
    }
