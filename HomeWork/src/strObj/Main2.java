package strObj;

public class Main2 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(2,3);
		Rectangle r2 = new Rectangle();
		r2.height=4;
		r2.width=5;
		r1.perimeter();
		r2.area();

	}

}