import java.io.*;

//������ byte�� ������ �� ����
//String, int, double �����ε� �����ϴ� ���

public class Exam_05 {
	public static void main(String[]args) throws Exception {
		File dir = new File("D:\\javaAPI\\study\\day21\\src");
		File file = new File(dir, "bbb.txt");
		
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.writeUTF("�ȳ��ϼ���!!");
		dos.writeInt(1230);
		dos.writeDouble(10.23);
	
		//dos.flush();//���� �޸� ���� (���� �޸� ������ ������ ���Ϸ� ����)
		dos.close();//���۸޸𸮸� ����, ��������
	}
}
