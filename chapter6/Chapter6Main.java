public class Chapter6Main {
	public static void main(String[] args) {
		
		Chapter6Item a = new Chapter6Item(); //インスタンス作成
		Chapter6Item b = new Chapter6Item(); //インスタンス作成
		b.setNum(20); //変数bのsetNum()メソッドを呼出し引数20を渡す
		System.out.println(a.getNum()); //変数aのnumは何も変化はないため、10となる。
		
		Chapter6Item c = new Chapter6Item();
		Chapter6Item d = new Chapter6Item();
		c.name = "apple";
		d.price = 100;
		c.price = 200;
		d.name = "banana";
		c = d; //変数dの参照を変数cに代入しているため、これ以降は、変数cとdは同じインスタンスの参照を持つことになり、dが参照される
		c.printInfo(); //よって、banana, 100と出力される
		
		Object obj = null;
		Object obj2 = false;
		//Object obj3 = NULL;
		Object obj4 = "";
		System.out.println(obj); //null
		System.out.println(obj2); //false
		System.out.println(obj4); //空欄
		
		//ガベージコレクタとは、利用されなくなったインスタンスを解放するJVMの機能の1つであり、メモリ上に使われなくなったインスタンスを探し、見つかればそのインスタンスを破棄し、メモリを解放する。
		//ガベージコレクションとは、ガベージコレクタが不要なインスタンスを探し、破棄すること。
		//ガベージコレクションの対象はどこからも参照されなくなったインスタンスである。
		Object e = new Object(); //e = null;とされているが、その前にg = eでeの参照をコピーしておいたため、対象外である。
		Object f = new Object(); //f = null;により、どこからも参照されないインスタンスとなり、ガベージコレクションの対象となる。
		Object g = e;
		e = null;
		f = null;
		//more code
 	}
}