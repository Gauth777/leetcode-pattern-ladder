class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        while ( left < right ) {
            while ( left < right && !vowels.contains(chars[left]+"")) {
                left++;
            }
            while ( left < right && !vowels.contains(chars[right]+"")){
                right--;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
        }
    }
