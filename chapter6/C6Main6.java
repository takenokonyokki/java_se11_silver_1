public class C6Main6 {
	public static void main(String[] args) {
		//21 コンストラクタと初期化子について
		C6Sample2 s = new C6Sample2(); //B Aと表示される
		
		//22 クラス変数、static初期化子について
		System.out.println(C6Sample3.num); //インスタンスを生成していないので、staticで修飾されたnum変数0が出力
		
		//23 コンストラクタについて
//		C6Sample4 s2 = new C6Sample4(); //C6Sample4クラスでは、String型を1つ受け取るコンストラクタが定義されており、引数なしのインスタンスを生成しようとしているため、コンパイルエラーとなる。
		
		//24 オーバーロードされたコンストラクタから、別のコンストラクタを呼び出す方法について
		C6Sample24 s3 = new C6Sample24();
		
		//25
		C6Sample25 s4 = new C6Sample25();
		
		//28
		//カプセル化は、フィールドを非公開（private）にし、アクセスするためのメソッドを提供する（public）ことで完成します
		
		//29 メソッドの引数がプリミティブ型の時、呼び出し先のメソッドの値がどのように渡されるかについて
		C6Sample29 s5 = new C6Sample29(10);
		modify(s5.num);
		System.out.println(s5.num);
	}
	
	private static void modify(int num) {
		num *= 2;
	}
}