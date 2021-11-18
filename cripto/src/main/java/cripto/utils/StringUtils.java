package cripto.utils;

import java.util.Base64;

public class StringUtils {
	
	public static boolean isStringValid(String pChaveSecreta) {
		return pChaveSecreta == null || pChaveSecreta.isBlank();
	}
	
	public static String base64Encode( byte[] pEncryptedBytes ) {
		return Base64.getEncoder().encodeToString(pEncryptedBytes);
	}
	
}