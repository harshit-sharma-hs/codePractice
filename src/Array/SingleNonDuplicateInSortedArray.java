package Array;

public class SingleNonDuplicateInSortedArray {
    public static int singleNonDuplicate(int[] nums) {
        int low =0;
        int high= nums.length-1;

        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(mid%2==1)
                mid--;

            if(nums[mid]==nums[mid+1])
                low+=2;
            else
                high=mid;
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,4,4,5,5};
        System.out.println(singleNonDuplicate(arr));
    }
}
