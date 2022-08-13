public class Chapter6Main5 {
	public static void main(String[] args) {
		//20　Chapter6Sampelには、コンストラクタが存在していない為、コンパイラによってデフォルトコンストラクタが自動的に追加される
		Chapter6Sample s = new Chapter6Sample();
		s.Chapter6Sample(); //デフォルトコンストラクタは、引数なし、処理なしのコンストラクタであるため、hello.が1回だけ表示される
	}
}