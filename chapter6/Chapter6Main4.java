public class Chapter6Main4 {
	public static void main(String[] args) {
		//17
		Chapter6Main4 m = new Chapter6Main4();
//		System.out.println(m.calc(2,3)); //あいまいなメソッド呼出しとして、コンパイルエラーとなる。
	}
		private double calc(double a, int b) {
			return (a + b) / 2;
		}
		private double calc(int a, double b) {
			return (a + b) / 2;
		}
		
		//19 コンストラクタのアクセス修飾子について
		//コンストラクタのルール
		//メソッド名をクラス名と同じにすること。戻り値型は記述できない。newと一緒にしか使えない（インスタンス生成時以外は呼出しができない）
		//public　→　どのクラスからでもこのクラスをインスタンス化できることを表している。
		//protectedやデフォルト　→　継承関係にあるサブクラスやパッケージ内のクラスだけが、このクラスをインスタンス化できるように制限をかける。
		//private　→　非公開なコンストラクタを定義するために使う。非公開なコンストラクタは、そのクラス以外がインスタンスを生成できないように制限したいときに使う。
}