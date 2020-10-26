public class Cylinder {
	
	private double height, radius;

	public Cone (double radius, double height){
		this.height = height;
		this.radius = radius;
	}

	public double area() {
		return 2 * 3.14f * radius * radius + 2 * 3.14f * radius * height;
	}

	public double volume() {
		return 3.14f * radius * radius * height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() { return height; };

	public double getRadius() { return radius; };

}
