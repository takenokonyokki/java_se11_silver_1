public class C7Main1 {
	public static void main(String[] args) {
		//1 クラスの継承
		//継承はあるクラスを機能拡張した新しいクラスを定義すること
		//拡張元になるクラスのことを基底クラスやスーパークラス、拡張したクラスのことを派生クラスやサブクラスと呼ぶ
		
		//2　継承では何を引き継ぐかについて
		//コンストラクタとprivateなフィールドやメソッドは引き継がない
		//アクセス修飾子
		//public →　すべてのクラスからアクセス可能
		//protected　→　同じパッケージに属するか、継承しているサブクラスからのみアクセス可能
		//デフォルト　→　同じパッケージに属するクラスからのみアクセス可能
		//private　→　クラス内からのみアクセス可能
		
		//3 インターフェースの基礎知識について
		//インターフェースに宣言する抽象メソッドには、処理内容を一切記述することはできない
		//インターフェース同士は多重継承が可能
		
		//4
		C7A4 a = new C7B4();
		a.sample();
		
		//5
		System.out.println(a);
		
		//6 デフォルトメソッドをオーバーライドしたメソッドから、元のデフォルトメソッドを呼び出すには下記構文となる
		//インターフェース名.super.メソッド名();
		//この構文は、サブインターフェースやインターフェースを直接実現したクラスでしか使用できない
		//オーバーライドしたメソッドから元のデフォルトメソッドの呼出しは、2つ以上の実現や継承の階層をまたいで行うことはできない
		
		//
	}
}