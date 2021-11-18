package cripto;

import org.junit.Assert;
import org.junit.Test;

public class DecryptAESTest {

	@Test
	public void testEncrypt() {
		// Arrange
		String key = "MINHACHAVESEGURA";
		String encryptedMessage = "oRtIfOk04Ah+2TfMC2+YgTQOO6FUGZ24Gx+xBNb/amA=";
		String originalMessage = "1111222233334444";
		DecryptAES aes = new DecryptAES(key);
		
		
		// Act
		String decryptedMessage = aes.decript(encryptedMessage);
		
		
		// Assert
		Assert.assertNotNull(decryptedMessage);
		Assert.assertFalse(decryptedMessage.isEmpty());
		Assert.assertEquals(originalMessage, decryptedMessage);
		System.out.println(decryptedMessage);
	}

}
