public class C6Sample25 {
	//25
	//オーバーロードされたコンストラクタから別のコンストラクタを呼び出すためにthisを使用するが、
	//ルールとして、オーバーロードされた別のコンストラクタを呼び出すコードは、最初に記述しなければならない
	public C6Sample25() {
		System.out.println("A");
//		this("B"); //thisより前に、コードが記述されているためコンパイルエラーとなる。

	}
	
	public C6Sample25(String str) {
		System.out.println(str);
	}
}