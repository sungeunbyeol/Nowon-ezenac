class MyException extends Exception{
	private String message;
	public MyException(String msg) {
		super(msg);
	}
	@Override
	public String getMessage() {
		message = super.getMessage() + " : ���� ���� ���� Ŭ����!!";
		return message;
	}
}


public class Exam_03 {
	public static void main(String[]args) {
		try {
			throw new MyException("�����ڵ�");
		} catch(MyException e) {
			System.err.println(e.getMessage());
		}
	}
}
