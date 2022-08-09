public class Chapter6Main3 {
	public static void main(String[] args) {
		//9 順次処理
//		System.out.println(a); //変数が宣言よりも前に使われているためコンパイルエラーとなる。
//		int a = 0;
		
		//10 メソッド定義における戻り値型について
		//アクセス修飾子　戻り値型　メソッド名（引数の型　引数名）　{ メソッド内の処理 }
		//メソッド宣言で戻り値型の宣言は必須。戻り値を戻さない場合には、戻り値にvoidを指定する。
		
		//11 メソッドの呼出しと戻り値について
//		Chapter6Sample s = new Chapter6Sample();
//		String val = s.setValue("hello"); //setValue()メソッドは戻り値型がvoidになっているため戻り値を戻せない。よってコンパイルエラーとなる。
		
		//12 メソッドの戻り値型と、戻り値型を受け取る変数の型との互換性について
		Chapter6Sample s = new Chapter6Sample();
		float result = s.divide(10, 2); //divide()メソッドの戻り値型はfloatだが、floatと互換性のあるdouble型でも問題ない。
		System.out.println(result);
		
		//13 呼出し元メソッドの引数の数とメソッドで定義している引数の数について
//		Chapter6Sample cs = new Chapter6Sample();
//		int result2 = cs.method(2); //method()メソッドでは、引数を2つ受け取るように宣言されているため、引数が1つだとコンパイルエラーとなる。
//		System.out.println(result2);
		
		//14 可変長引数 → その数を自由に変更できる引数のこと。引数の型の直後にピリオドを3つ「...」をつけて宣言する
		
		//16 オーバーロードについて　→　引数の数、型、順番が異なる同名のメソッドを定義すること。
		//メソッドの多重定義とも呼ばれ、同名のメソッドを複数宣言できること。ただし、名前が同じでも引数が異なることが条件。
		//メソッド名と引数のセットで見分けている。このセットのことをシグニチャと呼ぶ。
	}
}