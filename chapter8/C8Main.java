public class C8Main {
	public static void main(String[] args) {
		//1
		Algorithm algorithm = (String name) -> { //()内は、データ型を省略したnameでもよい
			System.out.println("hello, " + name);
		};
		Service s = new Service();
		s.setLogic(algorithm);
		s.doProcess("Lambda");
		
		//2
		Function2 f2 = (name) -> {
			return "hello, " + name;
		};
		System.out.println(f2.test("Lambda"));
		
		//3
		String val = "A";
		Function f = (val2) -> { //ローカル変数と同じ名前の変数をラムダ式の引数として使うことはできない
			System.out.println(val2);
		};
		f.test("B");
	}
	private static interface Function2 {
		String test(String name);
	}
}