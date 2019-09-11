
public class ArrayString {
	
	/**
	 * 
	 * Check if string has all unique character
	 * 
	 * @param input
	 * @return
	 */
	public static boolean isUniqueChar(String input) {
		
		if (input == null || "".equals(input)) {
			return true;
		}
		
		input = input.toLowerCase();
		
		int[] set = new int[26];
		
		for(int i = 0; i < input.length(); i++) {
			set[input.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < 26; i++) {
			if (set[i] > 1) {
				return false;
			}
		}
		
		return true;
		
	}
	
	
	public static boolean isUniqueCharWithoutSpace(String input) {
		int bit = 0;
		
		for(int i = 0; i < input.length(); i++) {
			
			int index = input.charAt(i) - 'a';
			
			if ((bit & (1 << index)) != 0) {
				return false;
			}
			
			bit |= (1 << index);
			
		}
		
		return true;
	}
	
	public static boolean checkIfPermutation(String s1, String s2) {
		
		int[] setdata = new int[26];
		
		for(int i = 0; i < s1.length(); i++) {
			setdata[s1.charAt(i) - 'a'] ++;
		}
		
		for(int i=0; i < s2.length(); i++) {
			setdata[s2.charAt(i) -'a']--;
		}
		
		for (int val : setdata) {
			if (val != 0) {
				return false;
			}
		}
		
		return true;
		
	}

}
