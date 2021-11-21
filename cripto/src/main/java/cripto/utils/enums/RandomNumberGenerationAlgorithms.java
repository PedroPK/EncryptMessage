package cripto.utils.enums;

public enum RandomNumberGenerationAlgorithms {
	
	NativePRNG("NativePRNG"),
	NativePRNGBlocking("NativePRNGBlocking"),
	NativePRNGNonBlocking("NativePRNGNonBlocking"),
	PKCS11("PKCS11"),
	SHA1PRNG("SHA1PRNG"),
	Windows_PRNG("Windows-PRNG");
	
	
	
	private final String aIdentifier;
	
	RandomNumberGenerationAlgorithms( String pIdentifier ) {
		this.aIdentifier = pIdentifier;
	}
	
	public String getIdentifier() {
		return this.aIdentifier;
	}
}
