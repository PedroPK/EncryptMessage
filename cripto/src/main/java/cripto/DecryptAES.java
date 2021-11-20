package cripto;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import cripto.utils.CryptoUtils;
import cripto.utils.StringUtils;
import cripto.utils.ValidationUtils;

public class DecryptAES {
	
	private final SecretKeySpec aSecretKey;
	
	public DecryptAES( String pSecretKey ) {
		ValidationUtils.validateParameter(
			pSecretKey, 
			"pSecretKey");
		
		this.aSecretKey = 
			CryptoUtils.newSecretKeySpecAES(pSecretKey);
	}
	
	public String decript( String pEncryptedMessage ) {
		try {
			ValidationUtils.validateParameter(
				pEncryptedMessage, 
				"pEncryptedMessage");
			
			Cipher cipher = CryptoUtils.getCipherDecryptAES(this.aSecretKey);
			
			byte[] decryptedBytes = 
						cipher.doFinal(
							StringUtils.base64Decode( pEncryptedMessage )
						);
			
			String decryptedMessage =
				new String(decryptedBytes);
			//System.out.println("New String = " + decryptedMessage);
			
			String valueDecryptedBytes = 
				String.valueOf(decryptedBytes);
			//System.out.println("Value Of = " + valueDecryptedBytes);
			return decryptedMessage;
				
				 
		} catch ( Exception e ) {
			throw new RuntimeException("Fail to encrypt the message: " + e);
		}
	}

	
}