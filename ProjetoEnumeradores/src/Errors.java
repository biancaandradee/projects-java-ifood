
public enum Errors {
	
	INVALID_CREDENTIALS(4058),
	UNAUTHORIZED_USER(2035),
	BAD_REQUEST(1087),
	NOT_FOUND(4004),
	UNEXPECTED(5001);
	
	private int errorCode;
	
	Errors(int code){
		this.errorCode = code;
	}
	
	public int getCode() {
		return this.errorCode;
	}
	
}
