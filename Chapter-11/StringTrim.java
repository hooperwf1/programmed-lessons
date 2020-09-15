public class StringTrim {
	public static void main(String[] args){
		String first = new String("  Hi    there");
		String second;

		second = first.trim();

		System.out.println(first);
		System.out.println(second);
	}
}
