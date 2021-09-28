// 일반적인 <up / down> 게임

import java.util.*;

public class Exam_03 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int comsu = (int)(Math.random()*100)+1; //컴퓨터가 랜덤숫자 정하기
		//System.out.println(comsu); //이건 내가확인하는 용도로 잠깐 만듦
		
		int num = 0;
		int co = 0;
		while(true) {
			System.out.print("수를 입력 : ");
			num = in.nextInt();
			++co;
			if(num==comsu) {
				break;
			} else if(num<comsu) {
				System.out.println("up!");
			} else {
				System.out.println("down!");
			}
		}
		
		System.out.print(co + "번만에 맞췄습니다.");
		
	}
}
