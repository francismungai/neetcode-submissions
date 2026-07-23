class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLength = 0;
        int maxFreq = 0;
        int[] charArr = new int[26];

        for(int right = 0; right < s.length(); right++) {
            charArr[s.charAt(right) - 'A']++;

            maxFreq = Math.max(maxFreq, charArr[s.charAt(right) - 'A']);

            while((right - left + 1) - maxFreq > k) {
                charArr[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
        
    }
}
