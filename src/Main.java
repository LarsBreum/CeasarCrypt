
/**
 * 
 * @author LarsB
 *	A programme to encrypt small strings of text using CeasarEncryption
 *
 */
public class Main {
		
	public static void main(String[] args) {
		Encrypt encrypter = new Encrypt();
		Decrypt decrypter = new Decrypt();
		System.out.println("HellomynameisLars");
		String code = encrypter.encrypt("Hello my name is Lars",3);
		System.out.println(code);
		
		
		String[] plaintexts = decrypter.decrypt(code);
//		for(int i = 0; i < plaintexts.length; i++) {
//			System.out.println(plaintexts[i]);
//		}
		
	}
	
	
}
