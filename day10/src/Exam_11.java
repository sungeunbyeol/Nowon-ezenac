import java.util.Scanner;

class Member1{
	private String name;
	private String address;
	private String tel;
	Member1(String name, String address, String tel){
		this.name = name;
		this.address = address;
		this.tel = tel;
	}
	//Member1(String name){
	//	this.name = name;
	//}
	public String getName() {
		return name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getTel() {
		return tel;
	}
	
	
	public void disp() {
		System.out.println("���α׷��� �����մϴ�.");
	}
}


public class Exam_11 {
	public static void main(String[]args) {
		
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.print("1.ȸ������ 2.ȸ������ 3.ȸ������ 4.ȸ������ 5.���� : ");
			int select = in.nextInt();
			switch(select) {
			case 1 :
			case 2 :
			case 3 :
			case 4 : 
			case 5 : mb1.disp(); System.exit(0);
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}
}
