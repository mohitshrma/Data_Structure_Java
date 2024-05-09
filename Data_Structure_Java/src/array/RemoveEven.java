package array;

public class RemoveEven {

    public static void main(String[] args) {

        int arr[] = {3,2,4,7,10,6,5};
        printArray(arr);
        int result[] = removeEven(arr);
        printArray(result);
    }

    /* The intuition behind the code is:-
        1. First pass an array and traverse through it.
        2. Check if any number is odd logic.
        3.Use counter to increase by 1 if an odd number is found.
        4.Create a new array of particular size and add elements inside it.
    */

    // A static method to print array
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //A static method to remove even elements from that array
    public static int[] removeEven(int arr[])
    {
       int Oddcount = 0;
       for(int i = 0; i<arr.length; i++)
       {
           if(arr[i] % 2 !=0)
           {
               Oddcount++;
           }
       }
       int[] result = new int[Oddcount];
       int idx = 0;
       for(int i = 0; i<arr.length; i++)
       {
           if(arr[i] % 2 != 0)
           {
               result[idx] = arr[i];
               idx++;
           }
       }
       return result;
    }

}
