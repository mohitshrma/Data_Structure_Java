package array;

public class SecondMaximuminArray {

    public static void main(String[] args) {
        int[] arr = {1,10,20,21,25,25,26,49,50};
        System.out.println(secondMaximumAlt(arr));
    }

//1st way
//    public static int secondMaximum(int[] arr)
//    {
//        int max = Integer.MIN_VALUE;
//        int secondMax = Integer.MIN_VALUE;
//
//        for(int i = 0; i<arr.length; i++)
//        {
//            if(arr[i] > max)
//            {
//                secondMax = max;
//                max = arr[i];
//            }
//            else if(secondMax>arr[i] && secondMax!=max)
//            {
//                secondMax = arr[i];
//            }
//        }
//        return secondMax;
//    }


    //2nd way
    public static int secondMaximumAlt(int[] arr)
    {
        Integer max = null;
        Integer secondMax = null;

        for(Integer check: arr)
        {
            if(check.equals(max) || check.equals(secondMax))
            {
                continue;
            }

            if(max == null || check > max)
            {
                secondMax = max;
                max = check;
            }

            else if(secondMax == null || check > secondMax)
            {
                secondMax = max;
            }
        }
        return secondMax ==null? max:secondMax;
    }



}
