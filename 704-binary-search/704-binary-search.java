class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            int mid = nums[middle];
            if (mid == target) {
                return middle;
            } else if (target > mid) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }

}