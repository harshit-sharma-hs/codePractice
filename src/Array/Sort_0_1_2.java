package Array;


public class Sort_0_1_2 {
    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int hi = nums.length - 1;

        while (mid <= hi) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                mid++;
                low++;
            } else if (nums[mid] == 1)
                mid++;

            else {
                swap(nums, mid, hi);
                hi--;
            }
        }
    }

    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 1, 2, 1, 2, 1, 1, 2, 2, 0, 0, 0, 2, 1, 2,};
        sortColors(nums);
        for (int i : nums)
            System.out.println(i);
    }


}
