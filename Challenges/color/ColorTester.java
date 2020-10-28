public class ColorTester {
	
	public static void main(String[] args){
		Color color = new Color();
		System.out.println(color);
		color.randomColor();
		System.out.println(color);
		color.setColor(10, 200, 150);
		color.setBlue(230);
		System.out.println(color);

		Color otherColor = new Color(150, 150, 200);
		otherColor.lighten(50.f);
		color.darken(10.f);
		System.out.println(color.blendColor(otherColor));
		System.out.println(color.getRed());
	}

}
