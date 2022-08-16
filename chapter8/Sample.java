import java.util.function.*;
public class Sample {
	public static void main(String[] args) {
		//4
		//ラムダ式外で宣言されたローカル変数にラムダ式内からアクセスするには、実質的にfinalな変数でなければならない
		//そのため、下記では、int型のcnt変数が0で初期化された後に、for文内でcnt変数が変更されてしまうため、コンパイルエラーとなる。
//		int cnt = 0;
//		Runnable r = () -> {
//			for (cnt = 0; cnt < 10; cnt++) {
//				System.out.print(cnt++);
//			}
//		};
//		new Thread(r).start();
		
		//7
//		Function<String, Integer> func = (str) -> {
//			return Integer.parseInt(str);
//		};
//		System.out.println(func.apply("100") * 2);
	}
}