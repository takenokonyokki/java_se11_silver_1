public class C6Sample24 {
	//24
	//オーバーロードされたコンストラクタから別のコンストラクタを呼び出すためにはthisを使う。
	//コンストラクタは、メソッド名をクラス名と同じにして、戻り値型を記述できない。
	public C6Sample24() { //アクセス修飾子のpublicはどのクラスからでもインスタンス化できる
		this(null, 0);
	}
	
	public C6Sample24(String str, int num) {
		System.out.println("ok.");
	}
}