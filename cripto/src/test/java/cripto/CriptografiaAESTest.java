package cripto;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CriptografiaAESTest {

	@Test
	public void testCriptografar() {
		// Arrange
		String chave = "MinhaChaveSegura";
		String mensagem = "1111 2222 3333 4444";
		CriptografiaAES aes = new CriptografiaAES(chave);
		
		
		// Act
		String mensagemCriptografada = aes.criptografar(mensagem);
		
		
		// Assert
		Assert.assertNotNull(mensagemCriptografada);
		Assert.assertFalse(mensagemCriptografada.isBlank());
		System.out.println(mensagemCriptografada);
	}

}

