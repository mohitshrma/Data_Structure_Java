package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,5,2,4,10,11,3,7,6};
        int target = 2;

        int result = binarySearch(nums, target);
        if(result != -1) {
            System.out.println("Element value found at index: " + result);
        }
        else {
            System.out.println("Element not found");
        }
    }

    public static int binarySearch(int[]nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right)
        {
            int mid = (left+right)/2;

            if(nums[mid] == target)
            {
                
            }
        }

        return -1;
    }
}
