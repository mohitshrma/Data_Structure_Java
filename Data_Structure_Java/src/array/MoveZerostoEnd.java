package array;

public class MoveZerostoEnd {

    public static void main(String[] args) {
        int[] arr = {1, 10, 0, 0, 2, 5, 11, 98, 0, 25};
        moveZeros(arr,10);
        printArray(arr);
    }

    //two pointers concept in array ; i--> checks and traverse element; j--> checks for zero's
    public static void moveZeros(int[]arr, int n)
    {
        int j = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]!=0 && arr[j]==0)
            {
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if(arr[j]!=0)
            {
                j++;
            }
        }
    }



    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}