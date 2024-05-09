package string;

public class CheckPalindrome {

    public static void main(String[] args) {
        System.out.println(isValidPalindrome("MIM"));
    }

    public static boolean isPalindrome(String word)
    {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while(start<end)
        {
            if(charArray[start] != charArray[end])
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    /*
    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

    Given a string s, return true if it is a palindrome, or false otherwise.



    Example 1:

    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.
         */

   public static boolean isValidPalindrome(String word)
   {
       char ch[] = word.toCharArray();
       int start = 0;
       int end = ch.length-1;

       while(start<end)
       {
           while(start<end && !Character.isLetterOrDigit(word.charAt(start)))
           {
                start++;
           }
           while(start<end && !Character.isLetterOrDigit(word.charAt(end)))
           {
               end--;
           }

           if(Character.toLowerCase(word.charAt(start))!= Character.toLowerCase(word.charAt(end)))
           {
               return false;
           }
           start++;
           end--;
       }
        return true;
   }
}
