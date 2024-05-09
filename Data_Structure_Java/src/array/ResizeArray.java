package array;

public class ResizeArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,10};
         arr= resizeArray(arr,10);
        printArray(arr);
        System.out.println(arr.length);
    }

    public static int[] resizeArray(int[] arr, int capacity)
    {
        int[] temp = new int[capacity];
        for(int i = 0; i<arr.length; i++)
        {
           temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public static void printArray(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
