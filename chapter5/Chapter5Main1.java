public class Chapter5Main1 {
	public static void main(String[] args) {
		//
		int[] array = new int[0];
		System.out.println(array); //ハッシュコードが表示される
		
		//配列の大かっこは、データ型の後ろだけでなく、変数名の前にも記述できる。
		int[] a;
		int b[];
		int[][] c; //2次元配列型変数
		int d[][]; //2次元配列型変数
		int[] e[]; //2次元配列型変数
		int[][] f[]; //3次元配列型変数
		
		//配列型変数を宣言するときは要素数を指定できない
//		int[3] g;
//		int h[2];
//		int[2] i[];
//		int j[3][];
		
		//変数とインスタンスの間で次元数を一致させる
		//int k[] = new int[2][3]; 
		//int[] l = new int[2.3];
		int m[] = new int[2 * 3];
		int n = 2, o = 3;
		int[] p = new int[n * o];
		int [][] q = new int[2][];
		//int r[][] = new int[][3]; 1次元目の要素数は省略できない
		
		//配列インスタンスを生成しただけでは要素の中身が作られることはない
//		ChapterItem[] items = new ChapterItem[3];
//		int total = 0;
//		for (int i = 0; i < items.length; i++) {
//			total += items[i].price;
//		}
//		System.out.println(total); //例外がスローされる
		
		//要素の値が変わっても配列そのものが変わるわけではない
		String[] array2 = { "A", "B", "C", "D" };
		array2[0] = null;
		for (String str : array2) {
			System.out.println(str);
		}
		
		//
		//int[] s = new int[2]{ 2, 3 }; //初期化子{}があるときは、要素数は自動的に計算される
		int t[][] = {}; //int t[][] = { { 2, 3 }, { 4, 5 } };と同じ形  
		int[][]u = new int[][] {};
		int[] v;
		v = new int[] { 2, 3 };
		int w[];
		//w = { 2, 3 }; //初期化子は、変数宣言時にしか使えない
		
		//
//		String[][] array3 = { { "A", "B" }, null, { "C", "D", "E" } };
//		int total2 = 0;
//		for (String[] tmp : array3) {
//			total2 += tmp.length; //2つめの要素がnullであり、参照先が存在しないため、実行時に例外がスローされる
//		}
//		System.out.println(total2);
		
		//
		int[][] arrayA = { { 1, 2 }, { 1, 2 }, { 1, 2, 3 } };
		int[][] arrayB = arrayA.clone();
		int total3 = 0;
		for (int[] tmp : arrayB) {
			for (int val : tmp) {
				total3 += val;
			}
		}
		System.out.println(total3);
	}
}