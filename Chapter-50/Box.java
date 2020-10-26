public class Box {
	
	private double height, width, length;

	public Box (double height, double width, double length) {
		this.height = height;
		this.width = width;
		this.length = length;
	}

	public Box (double side) {
		height = side;
		width = side;
		length = side;
	}

	public double volume() {
		return length * width * height;
	}

	public double area() {
		return 2 * length * width + 2 * width * height + 2 * length * height;
	}

	public void setHeight(double height){
		this.height = height;
	
	}
	public void setWidth(double width){
		this.width = width;
	}

	public void setLength(double length){
		this.length = length;
	}

	public double getHeight(){
		return height;
	}
	
	public double getWidth(){
		return width;
	}

	public double getLength(){
		return length;
	}
}
