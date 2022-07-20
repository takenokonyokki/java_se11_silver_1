public class Chapter6Item {
	private int num = 10;
	
	public String name;
	public int price;
	
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return this.num;
	}
	
	public void printInfo() {
		System.out.println(name + ", " + price);
	}
}