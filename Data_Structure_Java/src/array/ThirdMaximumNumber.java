package array;

public class ThirdMaximumNumber
{

    public static void main(String[] args) {
        int arr[] = {1,3,5,10,11,14,15,18,18,19,21,20};
        System.out.println(thirdMaximum(arr));
    }


    public static int thirdMaximum(int[] arr)
    {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for(Integer check: arr)
        {
            if(check.equals(max) || check.equals(secondMax) || check.equals(thirdMax))
            {
                continue;
            }

            if(max == null || check > max)
            {
                thirdMax = secondMax;
                secondMax = max;
                max = check;
            }
            else if(secondMax == null || check > secondMax)
            {
                thirdMax = secondMax;
                secondMax = check;
            }
            else if(thirdMax == null || check > thirdMax)
            {
                thirdMax = check;
            }
        }
        return thirdMax == null ? max:thirdMax;
    }

}


