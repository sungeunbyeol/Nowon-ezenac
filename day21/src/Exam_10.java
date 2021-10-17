import java.io.*;

class A10 implements Serializable{//직렬화, 역직렬화
	int a = 10;
	int b = 20;
	int c = 30;
}
public class Exam_10 {
	public static void main(String[] args) throws Exception {
		File dir = new File("D:\\javaAPI\\study\\day21\\src");
		File file = new File(dir, "ddd.txt");
				
		A10 ap = new A10();
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		
		oos.writeObject(ap);
		oos.close();
		
	}
}





