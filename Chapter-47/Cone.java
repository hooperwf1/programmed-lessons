public class Cone {
	
	private double height, radius;

	public Cone (double radius, double height){
		this.height = height;
		this.radius = radius;
	}

	public double area() {
		return 3.14f * radius * (radius + Math.sqrt(height * height + radius * radius));
	}

	public double volume() {
		return 3.14f * radius * radius * (height / 3.f);
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() { return height; };

	public double getRadius() { return radius; };

	public double slantHeight() {
		return Math.sqrt(radius * radius + height + height);
	}

	public double angle() {
		return Math.atan(radius/height);
	}

}
