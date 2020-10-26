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

	public Box(Box oldBox){
		this.length = oldBox.length();
		this.width = oldBox.width();
		this.height = oldBox.height();
	}

	public double volume() {
		return length * width * height;
	}

	public double area() {
		return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
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

	public double height(){
		return height;
	}
	
	public double width(){
		return width;
	}

	public double length(){
		return length;
	}

	private double faceArea(){
		return length * width;
	}
	
	private double topArea(){
		return length * height;
	}

	private double sideArea(){
		return height * width;
	}

	public Box biggerBox(Box oldBox){
		return new Box(1.25 * oldBox.height(), 1.25 * oldBox.width(), 1.25 * oldBox.length()); 
	}

	public Box smallerBox(Box oldBox){
		return new Box(.75 * oldBox.height(), .75 * oldBox.width(), .75 * oldBox.length()); 
	}

	public boolean nests(Box outsideBox){
		return length < outsideBox.length() && width < outsideBox.width() && height < outsideBox.height();
	}
}
