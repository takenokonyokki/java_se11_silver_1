import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDate; //日付を扱うクラス
public class C9Main {
	public static void main(String[] args) {
		//1 Mathクラス
		//powメソッド　→　累乗を求める　2つの引数を受け取る　第１引数に累乗したい値、第２引数に累乗する回数（指数）を指定する
		//2^3の場合　→　Math.pow(2, 3)
		
		//2 Comparatorインターフェースのcompareメソッドについて
		C9Sample[] samples = {
				new C9Sample(2, "B"),
				new C9Sample(3, "C"),
				new C9Sample(1, "A")
		};
		List<C9Sample> list = new ArrayList<C9Sample>(Arrays.asList(samples));
		list.sort(new SampleComparator());
		for (C9Sample s : list) {
			System.out.println(s.getName());
		}
		
		//3 java.util.Listインターフェースが持つsortメソッドは、コレクション内の要素を順番に並び替えるためのメソッド
		List<Integer> list2 = Arrays.asList(new Integer[] {1, 2, 3}); //1,2,3の順番でリストを生成している
		list2.sort((a, b) -> -a.compareTo(b)); //-演算子を付けて判定結果の数値の符号を逆転させる
		for (Integer num : list2) { //拡張for文で値を順番に取り出す
			System.out.println(num);
		}
		
		//4 Characterメソッドについて
		char a = '0';
		int num = 0;
		if (Character.isAlphabetic(a)) { //引数で受け取った文字がアルファベットかどうか調べるメソッド 0はアルファベットではないため、false
			num++;
		}
		if (Character.isDigit(a)) { //引数で受け取った文字が数字かどうか調べるためのメソッド 0は数字なのでtrueとなり、処理が実行される
			num++;
		}
		if (Character.isLowerCase(a)) { //引数で受け取った文字が小文字化どうか調べるためのメソッド　0は小文字に分類されないため、false
			num++;
		}
		System.out.println(num); //よって、1
		
		//5
		LocalDate b = LocalDate.of(2015, 0, 1); //日付を指定してインスタンスを生成する場合はofメソッド、現在の日付でインスタンスを生成したい場合には、nowメソッドを使用
					//ofメソッドで2015年0月1日という日付を指定してインスタンスを生成
					//LocalDateの月は1から始まるため、存在しない月を指定しているが、構文上誤りはないため、コンパイルエラーは起きないが実行時に例外がスローされる
		LocalDate c = LocalDate.parse("2015-01-01"); //文字列の日付をLocalDateクラスに変換するparseメソッド
		System.out.println(b.equals(c));
		
	}
} 