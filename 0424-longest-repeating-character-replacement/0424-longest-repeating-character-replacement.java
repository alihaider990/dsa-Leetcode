class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxLength = 0;
        int maxFrequency = 0;
        int[] frequency = new int[26]; 
        
        for (int right = 0; right < s.length(); right++) {
            char character = s.charAt(right);
            frequency[character - 'A']++;
            maxFrequency = Math.max(maxFrequency, frequency[character - 'A']);
            
            int windowLength = right - left + 1;
            
            if (windowLength - maxFrequency > k) {
                frequency[s.charAt(left) - 'A']--;
                left++;
            }
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}