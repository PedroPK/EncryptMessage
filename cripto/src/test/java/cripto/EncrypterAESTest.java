package cripto;

import org.junit.Assert;
import org.junit.Test;

public class EncrypterAESTest {

	@Test
	public void testCriptografar() {
		// Arrange
		String key = "MINHACHAVESEGURA";
		String message = "1111222233334444";
		EncrypterAES aes = new EncrypterAES(key);
		
		
		// Act
		String encryptedMessage = aes.encrypt(message);
		
		
		// Assert
		Assert.assertNotNull(encryptedMessage);
		Assert.assertFalse(encryptedMessage.isEmpty());
		System.out.println(encryptedMessage);
	}

}
