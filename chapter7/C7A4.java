public interface C7A4 {
	//4
	default void sample() { //default修飾子がないとコンパイルエラーとなる。
		System.out.println("sample");
	}
	
	//5
	//java.lang.Objectクラスに定義されているメソッドをインターフェースでデフォルトメソッドとしてオーバーライドするとコンパイルエラーとなる。
//	default String toString() {
//		return "A";
//	}
	
}