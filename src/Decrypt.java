/**
 * 
 * @author LarsB
 *	Class to decrypt a string
 */
public class Decrypt {
	/*
	 * Needs:
	 * String input
	 * String[] output; (all possible outputs)
	 * 
	 */
	
	private String[] output;
	
	public Decrypt() {
		output = new String[128];
	}
		
	public String[] decrypt(String input) {
		String temp = "";
		/*
		 * Needs to shift every char of input +1 for every char in ASCII (128 times)
		 */
		//looping through input 128 times (length of ASCII)
		for(int j = 0; j < 128; j++) {
			//shifting input once
			for(int i = 0; i < input.length(); i++) {
				//if it is the last letter in the alphabet
				if((int) input.charAt(i) == 127) {
					temp = temp + (char) 0;
				} else {
					temp = temp + (char) (input.charAt(i)+1);	
				}
			}
			
			//test kommentar
			System.out.println(temp);
			output[j] = input;
			input = temp;
			temp = "";
		}		
		return output;
	}

}
