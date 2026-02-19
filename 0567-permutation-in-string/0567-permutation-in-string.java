class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1map = new int[26];
        int[] windowMap = new int[26];
        
        for (int i = 0; i < s1.length(); i++) {
            s1map[s1.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < s2.length(); i++) {
            windowMap[s2.charAt(i) - 'a']++;
            
            
            if (i >= s1.length()) {
                windowMap[s2.charAt(i - s1.length()) - 'a']--;
            }
            
            
            if (i >= s1.length() - 1 && Arrays.equals(s1map, windowMap)) {
                return true;
            }
        }
        
        return false;
    }
}