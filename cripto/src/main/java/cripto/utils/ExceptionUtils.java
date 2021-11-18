package cripto.utils;

public class ExceptionUtils {
	
	public static void throwIllegalArgumentException(String pNomeVariavel) {
		throw new IllegalArgumentException( pNomeVariavel + " cannot be null or empty");
	}
	
}
