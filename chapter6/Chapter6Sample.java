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
}