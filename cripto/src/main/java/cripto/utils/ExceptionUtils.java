package cripto.utils;

public class ExceptionUtils {
	
	public static void throwIllegalArgumentException(String pNomeVariavel) {
		throw new IllegalArgumentException( pNomeVariavel + " não pode ser nulo ou vazio");
	}
	
}
