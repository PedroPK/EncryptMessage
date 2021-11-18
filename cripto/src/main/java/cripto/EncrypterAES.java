package cripto;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import cripto.utils.CryptoUtils;
import cripto.utils.StringUtils;
import cripto.utils.ValidationUtils;

public class EncrypterAES {
	
		private final SecretKeySpec aSecretKey;
	
	public EncrypterAES( String pSecretKey ) {
		ValidationUtils.validateParameter(
			pSecretKey, 
			"pSecretKey");
		
		this.aSecretKey = 
			CryptoUtils.newSecretKeySpecAES(pSecretKey);
	}

	public String encrypt( String pUncryptedMessage ) {
		try {
			ValidationUtils.validateParameter(
				pUncryptedMessage, 
				"pTextoDescriptografado");
			
			Cipher cipher = CryptoUtils.getCipherEncryptAES(this.aSecretKey);
			
			byte[] encryptedBytes = 
						cipher.doFinal( pUncryptedMessage.getBytes() );
			
			
			
			return 
				StringUtils.base64Encode(encryptedBytes);
			
		} catch ( Exception e ) {
			throw new RuntimeException("Fail to encrypt the message: " + e);
		}
	}
	
} 