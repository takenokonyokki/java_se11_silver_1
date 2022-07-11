public class Chapter3Main1 {
	public static void main(String[] args) {
		int a = 3; //int型の変数aに3を代入
		int b = a += 5; //b = a = a + 5なので、b = a = 3 + 5であり、bとaは、お互い8が代入される
		System.out.println(a + b); //結果16になる
		
		int num = -10;
		System.out.println(10 * -num); //10*10となり、100となる。
		
		//byte c = 0b10000000; //byte型は-128～127の範囲の値を扱う。0b1000000は128を2進数で表記しているため、コンパイルエラーとなる。
		short d = 128 + 128; //short型は-32768～32767の範囲の値を扱う。
		//int e = 2 * 3L; //int型とlong型で演算しているため、int型はlong型に変換されてから演算が行われる。int型にlong型は代入できないため、コンパイルエラーとなる。
		//float f = 10.0; //float型は、末尾にfがないとコンパイルエラーとなる。
		
		int g = 10;
		int h = g++ + g + g-- - g-- + ++g; //10 + 11 + 11 - 10 + 10
		System.out.println(h);
		
		boolean i = true;
		boolean j = true;
		//System.out.println(i <= j); //数値を比較する演算子のため、コンパイルエラー
		
		int k = 10;
		int l = 10;
		if (10 < k && 10 < ++l) { //kが10であるため、10 < 10でfalseとなり、ここで評価が終了し、++lは実行されない
			k++; //ここも実行されない
		}
		System.out.println(k + l); //よって、10+10で20
		
		int m = 100, n = 20, o = 30;
		System.out.println(m % n * o + m / n); //100%20*30+100/20=0*30+100/20=0+5=5
		
		
		Chapter3Sample cs1 = new Chapter3Sample(10); //生成
		Chapter3Sample cs2 = cs1; //同じインスタンスを参照
		cs1 = new Chapter3Sample(10); //新たにインスタンスを生成
		System.out.println(cs1 == cs2); //別のインスタンスなのでfalse
		
		
		Chapter3Sample cs3 = new Chapter3Sample(10, "a");
		Chapter3Sample cs4 = new Chapter3Sample(10, "b");
		System.out.println(cs3.equals(cs4));
		
		
		Object p = new Object();
		Object q = null;
		System.out.println(p.equals(q));
		
		
		String r = "sample";
		String s = "sample";
		String t = new String("sample");
		System.out.print(r == s);
		System.out.print(", ");
		System.out.println(r.equals(s));
		System.out.print(r == t);
		System.out.print(", ");
		System.out.println(r.equals(t));
		
		
		//intern()メソッドは、メモリ内の文字列を探して再利用するためのメソッド
		String u = "abc";
		String v = new String(u);
		
		int count = 0;
		if (u.intern() == "abc") {
			count++;
		}
		if (v.intern() == "abc") {
			count++;
		}
		if (u.intern() == v.intern()) {
			count++;
		}
		System.out.println(count);
		
		
		int num2 = 10;
		if (num2 <= 10) {
			System.out.println("ok");
		}
		
		
		if (false)
		System.out.println("A");
		System.out.println("B");
		
		
		int num3 = 10;
		if (num3 < 10) 
			System.out.println("A");
		else
			System.out.println("B");
		if (num3 == 10)
			System.out.println("C");
		
		
		int num4 = 10;
		if (num4 == 100)
			System.out.println("A");
		else if (10 < num4)
			System.out.println("B");
		else
		if (num4 == 10)
			System.out.println("C");
		else
		if (num4 == 10)
			System.out.println("D");
		
		
		final int NUM = 0;
		int num5 = 10;
		switch (num5) {
//		case "10":
//			System.out.println("A");
//			break;
//		case num5:
//			System.out.println("B");
//			break;
		case 2 * 5:
			System.out.println("C");
			break;
		case NUM:
			System.out.println("D");
			break;
		}
		
		
		int num6 = 1;
		switch (num6) {
		case 1:
		case 2:
		case 3: System.out.println("A");
		case 4: System.out.println("B");
		default:
			System.out.println("C");
		}
	}
}