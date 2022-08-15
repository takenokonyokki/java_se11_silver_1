class A1 {
	String val = "A";
	void print() {
		System.out.print(val);
	}
	
	//17
	void world() {
		System.out.println("A");
	}
	
	//19
	String name;
	String getName() {
		return this.name;
	}
	
	//20
	public A1() {
		System.out.println("A");
	}
	
	//21
	public A1(String val) {
		this();
		System.out.println(val);
	}
}