class Solution {
    public int reversePairs(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        return mergeSortAndCount(nums, 0, nums.length - 1);
    }
    private int mergeSortAndCount(int[] nums, int left, int right) {
        if (left >= right) return 0; // Base case: no reverse pairs in a single element
        int mid = left + (right - left) / 2;
        int count = 0;
        // Count reverse pairs in the left half, right half, and across the halves
        count += mergeSortAndCount(nums, left, mid);
        count += mergeSortAndCount(nums, mid + 1, right);
        count += countAndMerge(nums, left, mid, right);
        return count;
    }

    private int countAndMerge(int[] nums, int left, int mid, int right) {
        int count = 0;
        int j = mid + 1;
        // Count reverse pairs where nums[i] > 2 * nums[j]
        for (int i = left; i <= mid; i++) {
            while (j <= right && nums[i] > 2 * (long) nums[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }
        // Merge the two halves in sorted order
        merge(nums, left, mid, right);
        return count;
    }

    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        // Merge two sorted halves into temp array
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        // To Copy remaining elements from left half or right half
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        System.arraycopy(temp, 0, nums, left, temp.length);
    }
}
