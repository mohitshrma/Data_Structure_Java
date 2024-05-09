package array;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {3,0,1,2,5};
        System.out.println(missingNumber(arr));

    }

   public static int missingNumber(int[] arr)
   {
       int res = arr.length;
       for(int i = 0; i<arr.length; i++)
       {
           res = res ^ i;
           res = res ^ arr[i];
       }
       return res;
   }

}
