### 클래스
- 클래스 내에 생성자는 여러개를 만들 수 있다.

```
ex ) 

class Student{
	// 여기는 멤버필드라서 변수선언하는 곳 :
	String name;
	int kor;
	int eng;
	int rank;
	int tot;

	// 클래스 네임과 같은 이름은 생성자를 말하는데
	// 생성자를 직접 만들지 않으면 default로 자동 생성이 됨.
	// 그러나 이렇게 만들어주면 default 생성자가 사라짐
	Sutudent(String name, int kor, int eng){ // 매개변수에 따라서 생성자를 구분
		this.name = name; 		 
		this.kor = kor;
		this.eng = eng;
		tot = (kor+eng);
		rank = 1;
	}
	// 이 생성자랑 위에 생성자는 다름.
	Sutudent(String name, int kor){ 
		// this. 은 멤버필드에 있는 변수랑 생성자에 있는 변수(매개변수, 일반변수)와 이름이 같을 때 사용
		this.name = name; 
		this.kor = kor;
	}
}
```

 
