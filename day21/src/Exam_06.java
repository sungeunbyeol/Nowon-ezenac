import java.io.*;


public class Exam_06 {
	public static void main(String[]args) throws Exception {
		File dir = new File("D:\\javaAPI\\study\\day21\\src");
		File file = new File(dir, "bbb.txt");
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		DataInputStream dis = new DataInputStream(bis);
		
		String str = dis.readUTF();
		int a = dis.readInt();
		double b = dis.readDouble();
	
		System.out.println(str + " ," + a+","+b);
	}
}
