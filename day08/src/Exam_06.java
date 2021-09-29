import java.io.*;
import java.util.*;

class Lotto{
	int[] comsu;
	int[] select;
	int co;
	
	Lotto(){
		comsu = new int[6];
		select = new int[6];
		co = 0;
		comsuSetting();
	}
	
	void comsuSetting() {
		for(int i=0; i<6; ++i) {
			comsu[i] = (int)(Math.random()*45) + 1;
			for(int j=0; j<i; ++j) {
				if (comsu[i] == comsu[j]) {
					--i;
					break;
				}
			}
		}
	}
	
	void selectNum() {//�����Է� �޼ҵ�
		Scanner in = new Scanner(System.in);
		for(int i=0; i<6; ++i) {
			do {
				System.out.print(i+1+"��° ���� �Է� : ");
				select[i] = in.nextInt();
			}while(select[i]<1 || select[i]>45);
			for(int j=0; j<i; ++j) {
				if (select[i] == select[j]) {
					--i;
					break;
				}
			}
		}
	}
	void autoNum() {//�ڵ��Է� �޼ҵ�
		for(int i=0; i<6; ++i) {
			select[i] = (int)(Math.random()*45) + 1;
			for(int j=0; j<i; ++j) {
				if (select[i] == select[j]) {
					--i;
					break;
				}
			}
		}
	}  
	
	void getCount() {
		co = 0;
		for(int i=0; i<6; ++i) {
			for (int j=0; j<6; ++j) {
				if (comsu[i] == select[j]) {
					++co;
					break;
				}
			}
		}
	}
	
	void dispCom() {
		System.out.print("��ǻ�Ͱ� ������ ��ȣ : [");
		for(int i=0; i<5; ++i) {
			System.out.printf("%d , ", comsu[i]);
		}
		System.out.println(comsu[5]+"]");
	}
	
	void disp() {
		System.out.print("�����Ͻ� ��ȣ : [");
		for(int i=0; i<5; ++i) {
			System.out.printf("%d , ", select[i]);
		}
		System.out.println(select[5] + " - ���᰹�� : " + co + "]");
	}
}

public class Exam_06 {
	public static void main(String[] args) throws IOException {
		Lotto lotto = new Lotto();
		while(true) {
			System.out.print("1.�����Է�  2.�ڵ��Է�  3.���� : ");
			int select = System.in.read() - 48;
			System.in.skip(5);
			
			switch(select) {
			case 1 : lotto.selectNum(); break;
			case 2 : lotto.autoNum(); break;
			case 3 : lotto.dispCom();
					 System.out.println("���α׷��� �����մϴ�.");
					 System.exit(0);
			}
			lotto.getCount();
			lotto.disp();
		}
	}
}
