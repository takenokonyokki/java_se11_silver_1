public class Chapter4Main2 {
	public static void main(String[] args) {
		//2次元配列、2重ループ
		int array[][] = new int[][] { {1,2}, {2,3,4} };
		int total = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array[i].length; j++) {
				total += array[i][j];
			}
		}
		System.out.println(total);
		
		//拡張for文
//		String[][] array2 = { { "A", "B", "C" } };
//		for (Object obj : array2) {
//			System.out.print(obj);
//		}
		
		//
		String[] array3 = { "A", "B", "C" };
		for (String str : array3) {
			str = "D"; 
			System.out.print(str); //この拡張for文内ではDDDと出力されるが
		}
		for (String str : array3) {
			System.out.print(str); //ここでは、ABCと出力される
		}
		
		//
		String[] array4 = { "A", "B" };
		for (String a : array4) {
			for (String b : array4) {
				if ("B".equals(b))
					break;
				System.out.print(b);
			}
		}
		
		//
		int[] array5 = { 1, 2, 3, 4, 5 };
		int total2 = 0;
		for (int i : array5) {
			if (i % 2 == 0) {
				continue;
//				total2 += i; //到達不能コード
			}
			System.out.println(total2);
		}
		
		//ラベル
		int total3 = 0;
		a: for (int i = 0; i < 5; i++) {
			b: for (int j = 0; j < 5; j++) {
				if (i % 2 == 0) continue a;
				if (3 < j) break b;
				total3 += j;
			}
		}
		System.out.println(total3);
	}
}