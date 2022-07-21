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
}