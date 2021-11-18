package cripto;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class EncrypterAESTest {

	@Test
	public void testCriptografar() {
		// Arrange
		String key = "MinhaChaveSegura";
		String message = "1111 2222 3333 4444";
		EncrypterAES aes = new EncrypterAES(key);
		
		
		// Act
		String encryptedMessage = aes.encrypt(message);
		
		
		// Assert
		Assert.assertNotNull(encryptedMessage);
		Assert.assertFalse(encryptedMessage.isBlank());
		System.out.println(encryptedMessage);
	}

}
