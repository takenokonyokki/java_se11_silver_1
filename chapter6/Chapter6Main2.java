public class Chapter6Main2 {
	public static void main(String[] args) {
		//staticなフィールドにアクセスするには、「クラス名.フィールド名」と記述する。
		Chapter6Sample.num = 10; //static領域にある変数numの値を10に置き換える
		//staticなフィールドにアクセスする方法2つ目は、インスタンスを作成し、「参照.フィールド名」と記述する。
		Chapter6Sample s = new Chapter6Sample();
		Chapter6Sample s2 = new Chapter6Sample();
		s.num += 10; //Chapter6Sample.num += 10;と同じ意味
		s2.num = 30; //Chapter6Sample.num = 30;と同じ意味
		System.out.println(Chapter6Sample.num); //よって30が表示される
		
		
		//staticなメソッドからは、staticなフィールドにアクセスできる
		//staticではないメソッドからは、staticなフィールドにアクセスできる
		//staticなメソッドは、staticなメンバ（staticで修飾されたフィールドやメソッド）にしかアクセスできない
		
		Chapter6Sample sample = new Chapter6Sample();
		sample.hello();
		
		//シグニチャとは、メソッド名と引数のリストのセットのこと
		Chapter6Sample s3 = new Chapter6Sample();
		System.out.println(s3.add(10, 100));
	}
} 