//We will intialize the array of len 2 and values to -1,-1, so at end if no index is found we will check the array and return rhe value
//if mid == target then need to search for both left and right indx aas there is possibility on both sides
// mid<target search in right side fo array
//mid>target search in left side of array
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