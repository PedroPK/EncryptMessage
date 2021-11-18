package cripto.utils;

public class ValidationUtils {
	
	public static void validateParameter(String pParameter, String pParameterName) {
		if ( StringUtils.isStringValid(pParameter) ) {
			ExceptionUtils.throwIllegalArgumentException(pParameterName);
		}
	}
	
	public static void validateParameter(Object pParameter, String pParameterName) {
		if ( pParameter == null ) {
			ExceptionUtils.throwIllegalArgumentException(pParameterName);
		}
	}
	
}