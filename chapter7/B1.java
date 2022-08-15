class B1 extends A1 {
	String val = "B";
	
	//16
	void hello() {
		System.out.println("hello");
	}
	
	//17
	void world() {
		System.out.println("B");
	}
	
	//18
	String name;
	
	//20
//	public B1() {
//		//super();がコンパイラによって自動的に追加される
//		System.out.println("B");
//	}
	
	//21
	public B1() {
		super("B");
		System.out.println("C");
	}
	public B1(String val) {
		this();
		System.out.println(val);
	}
}