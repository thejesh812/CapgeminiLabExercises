package Lab;
import java.util.Arrays;

public class Exercise8 {
	
	private static boolean positiveString(String string) {
		char input[] = string.toCharArray();
		String copiedString = String.copyValueOf(input);
		
		Arrays.sort(input);
		return(new String(copiedString).equals(new String(input)));

	}

	public static void main(String[] args) {
	 
		String string = "PRAHARSHINI";
		
		System.out.println(positiveString(string)); 
	}

}
