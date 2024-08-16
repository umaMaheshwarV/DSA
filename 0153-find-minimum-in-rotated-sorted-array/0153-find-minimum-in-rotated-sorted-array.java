class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        return findPivot(nums, 0, len - 1);
    }

    public int findPivot(int[] nums, int left, int right) {
        // Base case: Only one element left
        if (left == right) {
            return nums[left];
        }

        int mid = left + (right - left) / 2;

        // Check if mid is the smallest element
        if (mid > left && nums[mid] < nums[mid - 1]) {
            return nums[mid];
        }

        // Check if the smallest element is to the right of mid
        if (nums[mid] > nums[right]) {
            return findPivot(nums, mid + 1, right);
        } else {
            // Check the left half
            return findPivot(nums, left, mid);
        }
    }
}
