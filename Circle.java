package pack1;
class Circle extends Shape{
	public int r;
	public Circle(int r) {
		this.r=r;
	}
	double calculation() {
		return 3.14*r*r;
	}
	public static void main(String args[]) {
		
	    Circle c=new Circle(3);
		System.out.println("Area of cicle:"+c.calculation());
		Rectangle r=new Rectangle(10,5);
		System.out.println("Area of rectangle:"+r.calculation());
	}

	
	

}
	
