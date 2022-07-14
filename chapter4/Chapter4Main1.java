public class Chapter4Main1 {
	public static void main(String[] args) {
		//while文は、条件式がtrueを戻す間、処理を繰り返す構文。必ず真偽値を戻さなければならない。また、while文の繰り返す条件として記述できる式は1つだけ。
//		int a = 11;
//		int b = 0;
//		while (b < 5) { //変数bの値が0～4の間、繰り返す
//			if (5 < a) { //変数aの値が6以上であれば
//				System.out.println(b);
//			}
//			a--; //a-1
//			b++; //b+1
//		}
		
		
		//do-while文は、while文と同様に、条件が合致している間、処理を繰り返す構文。繰り返し処理を実行してから判定するので、条件に合致するかどうかにかかわらず、1回は処理を実行する。
//		int c = 0;
//		do { //doの後にはかっこ()はつかない
//			System.out.println(c++);
//		} while (c < 5);
//		
//		
//		//
//		int d = 0;
//		while (d < 5) {
//			do //doの後の中カッコを省略した場合は、1文のみ記述できる
//				//d++;
//				//System.out.println(d);
//			while (true);
//		}
		
		
		//for文
		//for (初期化文; 条件文; 更新分) {
			//繰り返し処理
		//}
		//初期化文で複数の変数を宣言するときは、同じ型でなければならない
		//条件文は、カンマで区切って複数の記述はできない。複数の条件文を記述したい場合は、論理演算子を使う。
//		for (int i = 1, long j = 2; i < 5; i++) { //intとlong型があるので、コンパイルエラーとなる。
//			System.out.println(i * j);
//		}
		
		
		//変数のスコープ
		//javaの変数は宣言したブロック内（中カッコの範囲）でのみ有効となる。for文でも同じ
		int e = 1;
		for (int i = 2, total = 1; i <= 5; i++) {
			total = e * i;
			System.out.println(total);
		}
		//System.out.println(total); //for文内で宣言されたtotalをこのfor文外で呼び出そうとしても見つからない為、コンパイルエラーとなる。
		
		
		//
		for (int i = 0; i == 0; i++) {
			System.out.println(i);
		}
		
		
		//更新分は、繰り返し処理が終わってから実行される
		//初期化文→条件文→繰り返し処理→更新分（→条件文）で実行されていく
		for (int i = 0; i < 3; i++, period()) {
			System.out.print(i);
		}
	}
	private static void period() {
		System.out.print(",");
	}
}