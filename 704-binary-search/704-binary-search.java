class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            int midVal = nums[middle];
            if (midVal == target) {
                return middle;
            } else if (target > midVal) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1; //-1表示未找到
    }

}