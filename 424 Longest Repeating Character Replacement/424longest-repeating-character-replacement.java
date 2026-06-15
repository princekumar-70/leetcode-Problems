class Solution {
   public int characterReplacement(String s, int k) {

	    int low = 0;
	    int res = 0;

	    int[] freq = new int[26];

	    for(int high = 0; high < s.length(); high++) {

	        freq[s.charAt(high) - 'A']++;

	        int maxFreq = 0;

	        for(int i = 0; i < 26; i++) {
	            maxFreq = Math.max(maxFreq, freq[i]);
	        }

	        int len = high - low + 1;

	        while(len - maxFreq > k) {
	            freq[s.charAt(low) - 'A']--;
	            low++;

	            len = high - low + 1;

	            maxFreq = 0;
	            for(int i = 0; i < 26; i++) {
	                maxFreq = Math.max(maxFreq, freq[i]);
	            }
	        }

	        res = Math.max(res, len);
	    }

	    return res;
	}

}