public class Chapter3Sample {
	private int num;
	private String name;
	
	public Chapter3Sample(int num) {
		this.num = num;
	}
	
	public Chapter3Sample(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		if (obj == null) { //nullならば
			return false;
		}
		if (obj instanceof Chapter3Sample) {
			Chapter3Sample cs = (Chapter3Sample) obj;
			return cs.num == this.num;
		}
		return false;
	}
}