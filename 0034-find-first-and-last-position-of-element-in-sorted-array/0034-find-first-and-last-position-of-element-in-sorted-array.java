class Solution {
    public int[] helper(int[] nums,int target,int left,int right){
       int[] arr =new int[]{-1,-1};
        if(left > right){
            return arr;
        }
        int mid=left+(right-left)/2;
        if (nums[mid] == target) {
            arr[0] = mid;
            arr[1] = mid;
            int[] leftindex = helper(nums,target,left,mid-1);
            int[] rightindex = helper(nums,target,mid+1,right);
            if(leftindex[0] != -1){
                arr[0] = leftindex[0];
            }
            if(rightindex[1] != -1){
                arr[1] = rightindex[1];
            } 
            return arr;
        } else if (nums[mid] < target) {
            return helper(nums, target, mid + 1, right);
        } else {
            return helper(nums, target, left, mid - 1);
        }
    }
    public int[] searchRange(int[] nums, int target) {
        int len=nums.length;
        int[] result = helper(nums,target,0,len-1);
        if(result[0] == -1 && result[1] == -1) {
            return new int[]{-1, -1};
        }
        return result;
    }
}