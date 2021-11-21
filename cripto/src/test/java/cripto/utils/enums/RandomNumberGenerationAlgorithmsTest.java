package cripto.utils.enums;

import org.junit.Assert;
import org.junit.Test;

public class RandomNumberGenerationAlgorithmsTest {

	@Test
	public void testNameWindows_PRNG() {
		// Arrange
		String expected = "Windows-PRNG";
		
		// Act
		String rng = RandomNumberGenerationAlgorithms.Windows_PRNG.name();
		
		// Assert
		Assert.assertEquals(expected, rng);
	}
	
	@Test
	public void testToStringWindows_PRNG() {
		// Arrange
		String expected = "Windows-PRNG";
		
		// Act
		String rng = RandomNumberGenerationAlgorithms.Windows_PRNG.toString();
		
		// Assert
		Assert.assertEquals(expected, rng);
	}
	
	@Test
	public void testGetIdentifierWindows_PRNG() {
		// Arrange
		String expected = "Windows-PRNG";
		
		// Act
		String rng = RandomNumberGenerationAlgorithms.Windows_PRNG.getIdentifier();
		
		// Assert
		Assert.assertEquals(expected, rng);
	}
	
}
