package org.example.StringsProblems;

public class ReverseString {
    public static void main(String[] args) {
        String input = "SuryaKiran";
        System.out.println( "Before Revversed : "+input);
        String result =  reverseString(input);
        System.out.println( "After Revversed : "+result);
    }

    private static String reverseString(String input) {
        char[] chars = input.toCharArray();
        int left =0;
        int right = chars.length-1;

        while(left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
return new String(chars);
    }
}
