package cripto;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class CriptografiaAES {
	
	private final String ALGORITMO_AES = "AES";
	
	private final SecretKeySpec aChaveSecreta;
	
	public CriptografiaAES( String pChaveSecreta ) {
		if ( isStringValid(pChaveSecreta) ) {
			throwIllegalArgumentException("pChaveSecreta");
		}
		
		this.aChaveSecreta = new SecretKeySpec(pChaveSecreta.getBytes(), ALGORITMO_AES);
	}

	private void throwIllegalArgumentException(String pNomeVariavel) {
		throw new IllegalArgumentException( pNomeVariavel + " não pode ser nulo ou vazio");
	}

	private boolean isStringValid(String pChaveSecreta) {
		return pChaveSecreta == null || pChaveSecreta.isBlank();
	}
	
	public String criptografar( String pTextoDescriptografado ) {
		try {
			if ( isStringValid(pTextoDescriptografado) ) {
				throwIllegalArgumentException("pTextoDescriptografado");
			}
			
			Cipher cipher = Cipher.getInstance(ALGORITMO_AES);
			cipher.init(Cipher.ENCRYPT_MODE, this.aChaveSecreta);
			byte[] encriptedBytes = cipher.doFinal( pTextoDescriptografado.getBytes() );
			return base64Encode(encriptedBytes); 
		} catch ( Exception e ) {
			throw new RuntimeException("Falha ao Criptografar a mensagem: " + e);
		}
	}
	
	private String base64Encode( byte[] pEncryptedBytes ) {
		return Base64.getEncoder().encodeToString(pEncryptedBytes);
	}

} 