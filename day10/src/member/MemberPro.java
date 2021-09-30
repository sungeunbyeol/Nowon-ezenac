package member;

import java.util.*;

public class MemberPro {
	private Member2 mb[]; //ȸ���� �Ѹ� �̻��̱� ������ �迭 ���
	private int increment; 
	private int co;
	private Scanner in;
	
	public MemberPro() {
		mb = new Member2[5]; //�ϴ� mb �迭�� 5���� ��������.
		//�迭�� 5�ڸ��ε� ������ �����ϸ� increment���� �������� ����ŭ
		//�߰����� �� �ְ� �Ϸ��� ���� ����
		increment = 3; 
		co = 0;
		in = new Scanner(System.in);
	}
	
	public void input() {
		System.out.print("ȸ���� �̸� : ");
		String name = in.next();
		System.out.print("ȸ���� ��ȭ��ȣ : ");
		String tel = in.next();
		System.out.print("ȸ���� �ּ� : ");
		String address = in.next();
		Member2 input = new Member2(name,tel,address);
		mb[co] = input;
		++co;
		if(co==mb.length) {
			Member2[] mb2= new Member2[mb.length+increment];
			for(int i=0; i<mb.length; ++i) {
				mb2[i] = mb[i];
			}
			mb = mb2;
		}
	}
	public void view() {
		for(int i=0; i<co; ++i) {
			mb[i].disp();
		}
	}
	public void edit() {
		System.out.print("������ ȸ���� �̸� : ");
		String name = in.next();
		for(int i=0; i<co; ++i) {
			if(name.equals(mb[i].getName())) {
				System.out.print("���ο� ��ȭ��ȣ�� �Է� : ");
				String tel = in.next();
				mb[i].setTel(tel);
				System.out.print("���ο� �ּҸ� �Է� : ");
				mb[i].setAddress(in.next());
				return;
			}
		}
		System.out.println(name + "���� ���� ȸ���̾ƴմϴ�.");
	}
	public void delete(){
		System.out.print("������ ȸ���� �̸� : ");
		String name = in.next();
		for(int i=0; i<co; ++i) {
			if(name.equals(mb[i].getName())) {
				for(int j=i; j<co-1; ++j) {
					mb[j] = mb[j+1];
				}
				--co;
				return;
			}
		}
		System.out.println(name+"���� ���� ȸ���� �ƴմϴ�.");
	}
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
}
