public class RemoveBetweenSpaces {
	public static void main(String[] args) {
		String s1 = "  My name is         Yagyata";
		System.out.println(s1);
		System.out.println(s1.trim().replaceAll("\\s+"," "));
	}
}
