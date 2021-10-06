class MyException extends Exception{
	private String message;
	public MyException(String msg) {
		super(msg);
	}
	@Override
	public String getMessage() {
		message = super.getMessage() + " : 내가 만든 예외 클래스!!";
		return message;
	}
}


public class Exam_03 {
	public static void main(String[]args) {
		try {
			throw new MyException("예외코드");
		} catch(MyException e) {
			System.err.println(e.getMessage());
		}
	}
}
