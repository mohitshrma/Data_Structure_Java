package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1,5,2,4,10,11,3,7,6};
        int target = 11;

        int result = linearSearch(nums, target);
        if(result != -1) {
            System.out.println("Element value found at index: " + result);
        }
        else {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[]nums, int target) {
        for(int i:nums)
        {
            if(nums[i] == target)
            {
                return i;
            }
        }
        return -1;
    }

}

