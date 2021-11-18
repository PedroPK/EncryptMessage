package cripto;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DecryptAESTest {

	@Test
	public void testEncrypt() {
		// Arrange
		String key = "MinhaChaveSegura";
		String encryptedMessage = "NuKhQcQ9Ee3mCOrvnAaWPQMiHgoIr4c//ixcNsTc3wE=";
		String originalMessage = "1111 2222 3333 4444";
		DecryptAES aes = new DecryptAES(key);
		
		
		// Act
		String decryptedMessage = aes.decript(encryptedMessage);
		
		
		// Assert
		Assert.assertNotNull(decryptedMessage);
		Assert.assertFalse(decryptedMessage.isBlank());
		Assert.assertEquals(originalMessage, decryptedMessage);
		System.out.println(decryptedMessage);
	}

}
