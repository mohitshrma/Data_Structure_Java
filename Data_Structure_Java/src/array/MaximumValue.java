package array;

public class MaximumValue {

    public static void main(String[] args) {

        int[] arr = {1,10,100,102,105,200};
        printArray(arr);
        System.out.println(maximuminArray(arr));
    }

    public static int maximuminArray(int[] arr)
    {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
           if(arr[i] > max)
           {
               max = arr[i];
           }
        }
        return max;
    }

    public static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
