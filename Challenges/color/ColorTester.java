public class ColorTester {
	
	public static void main(String[] args){
		Color color = new Color(100,100,200);
		Color otherColor = new Color(150, 150, 200);
		color.blendColor(otherColor).printColor();
	}

}
