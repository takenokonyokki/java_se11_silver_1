public class C6Sample3 {
	//22
	static int num; //staticで修飾されたクラス変数は、インスタンスを生成しなくても使える変数。
	{
		num = 10;
	}
	public C6Sample3() {
		num = 100;
	}
	
	//23
	void C6Sample3() {
		System.out.println("A");
	}
	C6Sample3(String str) {
		System.out.println(str);
	}
}