package cripto.utils;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class CryptoUtils {
	
	public static SecretKeySpec newSecretKeySpecAES(String pSecretKey) {
		return new SecretKeySpec(
				pSecretKey.getBytes(), 
				ConstantUtils.ALGORITHM_AES);
	}
	
	public static Cipher getCipherAES() throws NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher cipher = Cipher.getInstance(ConstantUtils.ALGORITHM_AES);
		
		return cipher;
	}
	
	public static Cipher getCipherDecryptAES(SecretKeySpec pSecretKey)
	throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
		ValidationUtils.validateParameter(
			pSecretKey,
			"pSecretKey");
		
		Cipher cipher = CryptoUtils.getCipherAES();
		
		cipher.init(Cipher.DECRYPT_MODE, pSecretKey);
		
		return cipher;
	}
	
	public static Cipher getCipherEncryptAES(SecretKeySpec pSecretKey)
			throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException {
				ValidationUtils.validateParameter(
					pSecretKey,
					"pSecretKey");
				
				Cipher cipher = CryptoUtils.getCipherAES();
				
				cipher.init(Cipher.ENCRYPT_MODE, pSecretKey);
				
				return cipher;
			}
	
}
