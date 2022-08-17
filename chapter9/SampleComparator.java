//java.util.Comparatorインターフェースは、コレクション内のオブジェクトを並べ替える際の並び順を決めるアルゴリズムを定義するためのもの
import java.util.Comparator;
public class SampleComparator implements Comparator<C9Sample> {
	public int compare(C9Sample s1, C9Sample s2) {
		if (s1.getId() < s2.getId()) {
			return 1;
		}
		if (s2.getId() < s1.getId()) {
			return -1;
		}
		return 0;
	}
}