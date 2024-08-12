//Thru binary search we can directly check whether the mid element equals to target or not
//if not equals,while itertaing over the array either left index will be incremented or right index will be decremented so 
//   at one point if there is no match found there will be mid index showing where the number is expected.
class Solution {
    public int helper(int[] nums,int target,int left,int right){
       // [2,3,4,6,8,9,12,33,50,98]
       //System.out.println("left1"+left+"right1"+right);
        if(left > right){
           // System.out.println("left2"+left+"right2"+right);
            return left;
        };
        int mid=left+(right-left)/2;
        //System.out.println("mid"+mid);
        if (nums[mid] == target) {
            return mid; // Target found, return its index
        } else if (nums[mid] < target) {
            // Search in the right half
            return helper(nums, target, mid + 1, right);
        } else {
            // Search in the left half
            return helper(nums, target, left, mid - 1);
        }
    }
    public int searchInsert(int[] nums, int target) {
        int len=nums.length;
        return helper(nums,target,0,len-1);
        
    }
}