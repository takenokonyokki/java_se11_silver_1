public class Chapter2Main2 {
	public static void main(String[] args) {
		//Stringオブジェクトの作成
		String a = new String("sample"); //Stringクラスはnewしなくても使える
		String b = "sample";
		//String c = String.newInstance("sample"); //存在しない
		//String d = String.valueOf('sample'); //文字列は、ダブルクォーテーションで括る。また、このメソッドはstaticなメソッドのため、インスタンスを生成しなくても使える。
		
		
		String e = "abcde";
		
		//charAt()メソッドは、引数で指定された位置にある1文字だけを抜き出す。0から数える。
		System.out.println(e.charAt(4)); //引数を5以上にした場合、文字列は5までしかないため、文字列の範囲外にアクセスすることになるので、例外がスローされる。
		
		//indexOf()メソッドは、引数で指定された文字が文字列のどの位置に存在するか調べるためのメソッド。0から数える。
		System.out.println(e.indexOf("abcdef")); //abcdefという文字列は存在しないため、-1が戻される。
		
		//substring()メソッドは、文字列から任意の文字列を抽出するメソッド。
		System.out.println(e.substring(2,4)); //引数に2と4を渡しているため、文字列の2～4の範囲が抽出される。結果、cdとなる。
		
		//startsWith()メソッドは、文字列が引数で指定された文字で始まるかどうかを調べるためのメソッド。調べた結果は真偽値で戻される。
		System.out.println(e.substring(1, 3).startsWith("b")); //substring()メソッドで1～3の範囲であるbcが抽出され、それをstartsWith()メソッドでbから始まるか調べている。
		
		//length()メソッドは、文字数を戻すメソッド。
		//System.out.println(e.charAt(e.length())); //charAt()メソッドは、0から始まるため、0～4の数字で、length()メソッドは、5文字で戻されるため、例外がスローされる。
		
		
		String f = "aaaa";
		
		//replace()メソッドは、文字列を置き換えるためのメソッド。
		System.out.println(f.replace("aa", "b")); //aaをbに変え、baaとなり、残りのaaもbに変え、結果bbになる。
		
		
		//concat()メソッドは、インスタンスが保持する文字列を引数として渡された文字列と連結し、新しい文字列を戻すメソッド。
		String g = "Hello, ".concat("Java!");
		System.out.println(g);
		
		
		//+演算子は、数値と文字列が混同する場合、数値を文字列に変換する。また、左から順に実行される。
		System.out.println(10 + 20 + "30" + 40); //まず、10+20が実行されて30となり、30+"30"が実行されて"3030"となり、"3030"+40が実行されて"303040"となる。
		
		
		//+=演算子
		String h = null;
		h += "null";
		System.out.println(h);
		
		
		//引数を渡さないコンストラクタの場合、StringBuilderは16文字分のバッファを持ったインスタンスが生成される。
		StringBuilder sb = new StringBuilder("abcde");
		System.out.println(sb.capacity()); //5+16で21が戻される
		
		System.out.println(sb.indexOf("bcd"));
		
		
		//append()メソッドは、文字列に新しい文字列を追加するメソッド
		//reverse()メソッドは、文字列を反転するメソッド
		StringBuilder sb2 = new StringBuilder();
		sb2.append("abcde"); //"abcde"を追加
		sb2.reverse(); //文字列を反転し、"edcba"となる
		sb2.replace(1, 3, "a"); //文字列の1～3の範囲であるdcを"a"に変える
		System.out.println(sb2); //eabaとなる
	}
}