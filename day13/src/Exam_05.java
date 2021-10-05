
public class Exam_05 {
	public static void main(String[]args) {
		String str = "Hello, avaj!!";
		//String클래스는 정적인 클래스.. 특정값을 삭제하고 추가하는 기능이 없다.
		//이런 단점을 해결하기 위해 StringBuffer, StringBuilder 클래스가 나왔다.
		//두 클래스는 기능이 똑같으나, 
		//StringBuffer는 멀티스레드에서 StringBuilder는 단일스레드에서 사용된다.
		StringBuffer buffer = new StringBuffer(str);
		buffer.delete(10, 11);
		buffer.insert(7,"j");
		
		str = new String(buffer);
		System.out.println(str);
	}
}
