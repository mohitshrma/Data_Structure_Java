package array;

public class MinimumValue {

    public static void main(String[] args) {

        int[] arr = {1,10,100,20,25,200};
        printArray(arr);
        System.out.println(minimuminArray(arr));

    }


    public static int minimuminArray(int[] arr)
    {
        int min = arr[0];
        for(int i = 1; i< arr.length; i++)
        {
            if(arr[i] < min)
            {
                min = arr[i];
            }

        }
        return min;
    }


    public static void printArray(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
