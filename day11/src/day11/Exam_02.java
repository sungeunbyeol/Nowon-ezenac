import java.util.*;
interface 프로토스{
	public abstract void 공격();		//추상메소드
	public abstract void 이동();
}
class 질럿 implements 프로토스{
	public void 공격(){
		System.out.println("질럿이 공격을 합니다.");
	}
	public void 이동() {
		System.out.println("질럿이 이동을 합니다.");
	}
}
class 드래곤 implements 프로토스{
	public void 공격(){
		System.out.println("드래곤이 공격을 합니다.");
	}
	public void 이동() {
		System.out.println("드래곤이 이동을 합니다.");
	}
}
public class Exam_02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		프로토스 pro; 
		프로토스 pro1 = new 프로토스() {
			public void 공격() {
				
			}
			public void 이동() {
				
			}
		};
		System.out.print("1.질럿  2.드래곤 : ");
		int select1 = in.nextInt();
		System.out.print("1.공격  2.이동 : ");
		int select2 = in.nextInt();
		
		if (select1 == 1) {
			pro = new 질럿();
		} else {
			pro = new 드래곤();
		}
		if (select2 == 1) {
			pro.공격();
		}else {
			pro.이동();
		}
	}
}







