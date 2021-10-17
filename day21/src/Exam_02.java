import java.io.*;
import javax.swing.*;
public class Exam_02 {
	public static void main(String[] args) throws IOException{
		File dir = new File("C:\\javaAPI\\study\\day21\\src");
		File file = new File(dir, "aaa.txt");
		
		String[] d = dir.list();	//디렉토리 목록을 String배열로 반환
		for(int i=0; i<d.length; ++i) {
			System.out.println(d[i]);
		}
		/*
		if (file.isHidden()) {
			System.out.println("aaa.txt파일은 숨김 파일입니다.");
		}else {
			System.out.println("aaa.txt파일은 숨김 파일이 아닙니다.");
		}
		
		/*
		if (file.canRead()) {
			System.out.println("aaa.txt파일은 읽을 수 있습니다.");
		}else {
			System.out.println("aaa.txt파일은 읽을 수 없습니다.");
		}
		/*
		if (file.canWrite()) {
			System.out.println("aaa.txt파일은 쓸수 있습니다.");
		}else {
			System.out.println("aaa.txt파일은 쓸수 없습니다.");
		}
		/*
		if (dir.isDirectory()) {
			System.out.println("디렉토리 입니다.");
		}else {
			System.out.println("디렉토리가 아닙니다.");
		}
		/*
		if (file.isFile()) {
			System.out.println(file);
		}else {
			System.out.println("file객체는 파일이 아닙니다.");
		}
		/*
		File file = null;
		JFileChooser jfc = new JFileChooser(".");
		int res = jfc.showOpenDialog(null);
		if (res==0) {
			file = jfc.getSelectedFile();
			System.out.println("file = " + file);
		}else {
			System.out.println("파일선택을 안하셨습니다.");
		}
		/*
		File dir = new File("D:\\javaAPI\\study\\day21\\src");
		File file = new File(dir, "aaa.txt");
		/*
		int filesize = (int)file.length();
		System.out.println("파일 크기 : " + filesize + "bytes");
		/*
		System.out.println("file.getName() = " + file.getName());
		System.out.println("file.getParent() = " + file.getParent());
		/*
		if (file.delete()) {	//파일이 존재하면 삭제하고 true 반환
			System.out.println("aaa.txt파일을 삭제!!");
		}else {					//파일이 없으면 false 반환
			System.out.println("aaa.txt파일이 없습니다.");
		}
		/*
		if (file.createNewFile()) {	//존재하지 않으면 파일을 만들고 true
			System.out.println("aaa.txt파일을 만들었습니다.");
		}else {						//존재하면 false
			System.out.println("aaa.txt파일이 이미존재합니다.");
		}
		
		/*
		File imsi = File.createTempFile("temp", ".txt", dir);
		//dir폴더에 temp로 시작하고 .txt로 끝나는 임시 파일이 만들어 진다.
		try {Thread.sleep(5000);}catch(Exception e) {}
		imsi.deleteOnExit();//프로그램이 끝나면 imsi파일을 삭제해라
		/*
		if (file.createNewFile()) {	//존재하지 않으면 파일을 만들고 true
			System.out.println("aaa.txt파일을 만들었습니다.");
		}else {						//존재하면 false
			System.out.println("aaa.txt파일이 이미존재합니다.");
		}
		/*
		if (file.exists()) {
			System.out.println("aaa.txt파일이 존재합니다.");
		}else {
			System.out.println("aaa.txt파일이 존재하지 않습니다.");
		}
		*/
	}
}
