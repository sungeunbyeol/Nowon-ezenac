class A04{}
interface B04{}

//Ŭ������ Ŭ������ ��ӹ��� �� �ֽ��ϴ�
class C04 extends A04{}

//Ŭ������ �������̽��� ��ӹ��� �� �ֽ��ϴ�
class D04 implements B04{}

//Ŭ������ Ŭ������ ��ӹް� �������̽��� ��ӹ��� �� �ֽ��ϴ�
class E04 extends A04 implements B04{}

//�������̽��� �������̽��� ��ӹ��� �� �ֽ��ϴ�.
interface F04 extends B04{}

//�������̽��� Ŭ������ ��ӹ��� �� �����ϴ�.
//interface G04 implements A04{} - Ű���� ��ü�� ����

//�������̽��� �������̽��� ���� ��� ���� �� �ֽ��ϴ�.
interface G04 extends B04, F04{}

//Ŭ������ Ŭ������ ���� ��� ���� �� �����ϴ�.
//class H04 extends A04, E04{} - �ϳ��� ���� �� �ִ�.

//Ŭ������ �������̽��� ���� ��� ���� �� �ֽ��ϴ�.
class H04 implements B04, F04, G04{}

//Ŭ������ Ŭ������ ��ӹް� �������̽��� ���� ��� ���� �� �ֽ��ϴ�.
class I04 extends A04 implements B04, F04{}


/*
 * class A04{} 
 * class B04{} 
 * //class C04 extends A04, B04{} - Ŭ������ ���߻���� �ȵȴ�
 */
public class Exam_04 {
}