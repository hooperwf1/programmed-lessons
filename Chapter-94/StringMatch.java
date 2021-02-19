public class StringMatch {
	public static void main(String[] args){
		System.out.println(matches("MOON", "M??N"));
	}

	public static boolean matches(String s1, String s2){
		if(s1.length() == 1 || s2.length() == 1){
			return (s1.length() == s2.length()) && charMatch(s1, s2); 
		}

		return charMatch(s1.substring(0, 1), s2.substring(0, 1)) && matches(s1.substring(1), s2.substring(1));
	}

	public static boolean charMatch(String s1, String s2){
		if(s1.length() != 1 || s2.length() != 1){
			return false;
		}

		return s1.charAt(0) == '?' || s2.charAt(0) == '?' || s1.charAt(0) == s2.charAt(0);
	}
}
