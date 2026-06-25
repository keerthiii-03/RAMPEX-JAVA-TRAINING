class Solution {
    public int majorityElement(int[] nums) {
        for (int num : nums) {
            if (num < 0) {
                return -1;
            }
        }

        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0)
                candidate = num;

            if (candidate == num)
                count++;
            else
                count--;
        }

        return candidate;
    }
}
