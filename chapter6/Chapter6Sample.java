public class Chapter6Sample {
	//staticなフィールドはインスタンスを作らなくても使える性質を持っている
	//staticなフィールドはインスタンスとは別の領域にある変数だと考える
	static int num = 10;
	
	public void hello() {
		System.out.println("hello");
	}
	
	public int add(Integer a, Integer b) {
		return a + b;
	}
	
	//11
	private String value;
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return this.value;
	}
	
	//12
	float divide(int a, int b) {
		return (float) a / (float) b;
	}
	
	//13
	public int method(int a, int b) {
		return a + b;
	}
	
	//15 return文について
	public void method(int num) {
		if (num < 0) return;
		System.out.println("A");
		return; //returnで強制的に制御を戻され、これ以降は処理は実行されない
//		System.out.println("B"); //到達不能コードとしてコンパイルエラーとなる。
	}
	
	//20 コンストラクタは戻り値型を定義できない為、下記はコンストラクタではなく、通常のメソッドとして解釈される
	void Chapter6Sample() {
		System.out.println("hello.");
	}
}