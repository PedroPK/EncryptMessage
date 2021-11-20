package cripto.utils;

import java.util.Base64;

public class StringUtils {
	
	public static boolean isStringValid(String pChaveSecreta) {
		return pChaveSecreta == null || pChaveSecreta.isEmpty();
	}
	
	public static String base64Encode( byte[] pEncryptedBytes ) {
		return Base64.getEncoder().encodeToString(pEncryptedBytes);
	}
	
	public static byte[] base64Decode( String pEncryptedMessage ) {
		//System.out.println( "Before Decode = " + pEncryptedMessage );
		// "oRtIfOk04Ah+2TfMC2+YgTQOO6FUGZ24Gx+xBNb/amA="
		
		byte[] bytes = Base64.getDecoder().decode(pEncryptedMessage);
		//System.out.println( "After Decode = " + bytes );
		// "[B@735b5592"
		
		//System.out.println("\n\n");
		//System.out.println(Arrays.toString(bytes));
		// 
		
		return bytes;
	}
	
}