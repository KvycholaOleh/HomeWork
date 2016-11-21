package strObj;

public class Rectangle {
	int width;
	int height;
	
	Rectangle(){
		
	}
	
	Rectangle(int width, int height){
		this.width=width;
		this.height=height;
	}
	
	void perimeter(){
		System.out.println("Периметр прямокутника = "+((width+height)*2));
	}
	
	void area(){
		System.out.println("Площа прямокутника = "+width*height);
	}

}
