public class RemoveVowels {
	public static void main(String[] args){
		System.out.println(removeVowels("Apple"));
	}

	public static String removeVowels(String s){
		if(s.length() == 1){
			return !isAVowel(s.substring(0, 1)) ? s.substring(0, 1) : "";
		}

		return (!isAVowel(s.substring(0, 1)) ? s.substring(0, 1) : "") + removeVowels(s.substring(1));
	}

	public static boolean isAVowel(String letter){
		if(letter.length() != 1) return false;

		return letter.toLowerCase().matches("[aeiou]");
	}
}
