public class CountChar {
	public static void main(String[] args){
		System.out.println(countChar("XaaaYaaaZaaaYaaaaY", 'Y'));
	}

	public static int countChar(String s, char c){
		if(s.length() == 1){
			return s.charAt(0) == c ? 1 : 0;
		}

		return (s.charAt(0) == c ? 1 : 0) + countChar(s.substring(1), c);
	}
}
