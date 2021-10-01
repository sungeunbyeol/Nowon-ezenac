class A04{}
interface B04{}

//클래스는 클래스를 상속받을 수 있습니다
class C04 extends A04{}

//클래스는 인터페이스를 상속받을 수 있습니다
class D04 implements B04{}

//클래스는 클래스를 상속받고 인터페이스를 상속받을 수 있습니다
class E04 extends A04 implements B04{}

//인터페이스는 인터페이스를 상속받을 수 있습니다.
interface F04 extends B04{}

//인터페이스는 클래스를 상속받을 수 없습니다.
//interface G04 implements A04{} - 키워드 자체도 없다

//인터페이스는 인터페이스를 다중 상속 받을 수 있습니다.
interface G04 extends B04, F04{}

//클래스는 클래스를 다중 상속 받을 수 없습니다.
//class H04 extends A04, E04{} - 하나만 받을 수 있다.

//클래스는 인터페이스를 다중 상속 받을 수 있습니다.
class H04 implements B04, F04, G04{}

//클래스는 클래스를 상속받고 인터페이스를 다중 상속 받을 수 있습니다.
class I04 extends A04 implements B04, F04{}


/*
 * class A04{} 
 * class B04{} 
 * //class C04 extends A04, B04{} - 클래스는 다중상속이 안된다
 */
public class Exam_04 {
}