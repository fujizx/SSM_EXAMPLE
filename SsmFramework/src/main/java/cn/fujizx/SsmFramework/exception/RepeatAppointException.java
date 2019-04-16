package cn.fujizx.SsmFramework.exception;

public class RepeatAppointException extends RuntimeException {
	/**
	 * 重复预约异常
	 */
	public RepeatAppointException(String message) {
		super(message);
	}

	public RepeatAppointException(String message, Throwable cause) {
		super(message, cause);
	}

}
