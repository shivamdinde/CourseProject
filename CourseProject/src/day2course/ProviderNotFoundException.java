package day2course;

public class ProviderNotFoundException extends Exception {
	private String invalidProviderName;
	public ProviderNotFoundException(String errorMessage, String invalidProviderName) {
		super(errorMessage);
		this.invalidProviderName = invalidProviderName;
	}
	@Override
	public String getMessage() {
		String message = super.getMessage();//Invokes getMessage from Exception class
		String finalMessage = message + ": " + invalidProviderName;
		return finalMessage;
	}
}
