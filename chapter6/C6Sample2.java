public class C6Sample2 {
	//21
	C6Sample2() {
		System.out.println("A");
	}
	//{}は初期化子である
	//初期化子は、すべてのコンストラクタで共通する前処理を記述するために使用する
	//そのため、初期化子はコンストラクタが実行される前に実行される
	{
		System.out.println("B");
	}
}