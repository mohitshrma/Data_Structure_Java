package array;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(hasDuplicate(nums));
    }

    public static boolean hasDuplicate(int[] nums)
    {
        //creating a new hashset as hashset can't contain duplicate elements
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++)
        {
            set.add(nums[i]);
        }
        if(set.size()<nums.length)
        {
            return true;
        }
        return false;
    }

}
