public class Chapter2Main2 {
	public static void main(String[] args) {
		//Stringオブジェクトの作成
		String a = new String("sample"); //Stringクラスはnewしなくても使える
		String b = "sample";
		//String c = String.newInstance("sample"); //存在しない
		//String d = String.valueOf('sample'); //文字列は、ダブルクォーテーションで括る。また、このメソッドはstaticなメソッドのため、インスタンスを生成しなくても使える。
	}
}