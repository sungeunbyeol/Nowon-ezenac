import java.io.*;

//원래는 byte만 저장할 수 있음
//String, int, double 형으로도 저장하는 방법

public class Exam_05 {
	public static void main(String[]args) throws Exception {
		File dir = new File("C:\\javaAPI\\study\\day21\\src");
		File file = new File(dir, "bbb.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		 
		dos.writeUTF("안녕하세여!!");
		dos.writeInt(1230);
		dos.writeDouble(10.23);
	
		//dos.flush();//버퍼 메모리 비우기 (버퍼 메모리 내용을 지정된 파일로 저장)
		dos.close();//버퍼메모리를 비우고, 파일종료
	}
}
