class Solution {
    public int majorityElement(int[] nums) {
        int majority=0;
        int candidate=0;
        for(int i =0; i<nums.length; i++){
            if(candidate == 0){  //if nums is becomes 0
                majority=nums[i]; //change the candidate
            }
            if(nums[i] == majority ) { //same number
                candidate++; //candidate increases
            } else {
                candidate--; //diff number candidate decreases
            }

            
        }
        return majority;
    }
}
