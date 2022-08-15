public class C7Main2 {
	public static void main(String[] args) {
		AbstractSample s = new ConcreteSample();
		s.sample();
		
		//12
		A1 a = new A1();
		A1 b = new B1();
		System.out.print(a.val);
		System.out.print(b.val);
		a.print();
		b.print();
		
		//13
		Worker worker = new Enginner();
		worker.work();
		
		//16
		A1 a1 = new B1(); //A1型のB1インスタンス。なので、A1とB1の互換性を示している
		B1 b1 = (B1) a1; //ダウンキャスト
		b1.hello();
		
		//17
//		A1 a2 = new A1(); //A1型のA1インスタンス。
//		B1 b2 = (B1) a2; //ダウンキャスト。しかし、A1とB1の互換性を示すものがない為、コンパイラは問題なく通るが、実行時に例外がスローされる。
//		b2.world();
		
		//18
		C7Sample s2 = new C7Sample(10);
		System.out.println(s2.getNum());
		
		//19
		B1 b3 = new B1();
		b3.name = "sample";
		System.out.println(b3.getName());
		
		//20
		A1 a4 = new B1();
		
		System.out.println();
		
		//21
		new B1("D");
	}
}