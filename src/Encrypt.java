
/**
 * 
 * @author LarsB
 *	The encryption part of the programme
 */
public class Encrypt {
	
	/*
	 * NEEDS:
	 * String input
	 * String output
	 * int shift
	 */
	
	private String output;
	
	public Encrypt() {
		output = "";
	}
	
	
	public String encrypt(String input, int shift) {
		//Remove spaces
		input = input.replace(" ", "");
		
		for(int i = 0; i < input.length(); i++) {
			//shift the input shift letters
			output = output + (char) (input.charAt(i)+shift);
		}
		
		return output;
	}
	
}
