import java.util.*;

public class Color {
	
	int colors[] = new int[3];
	Random random;

	Color(){
		random = new Random();

		randomColor();
	}

	Color(int r, int g, int b){
		random = new Random();

		setColor(r, g, b);
	}

	public void randomColor(){
		for (int i = 0; i < 3; i++){
			colors[i] = random.nextInt(256);
		}

	}

	public void setColor(int r, int g, int b){
		colors[0] = r;
		colors[1] = g;
		colors[2] = b;

		correctColor();
	}

	public void setRed(int r){
		setColor(r, colors[1], colors[2]);
	}

	public void setGreen(int g){
		setColor(colors[0], g, colors[2]);
	}

	public void setBlue(int b){
		setColor(colors[0], colors[1], b);
	}
	
	public int[] getColors(){
		return colors;
	}

	public int getRed(){
		return getColors()[0];
	}
	
	public int getGreen(){
		return getColors()[1];
	}

	public int getBlue(){
		return getColors()[2];
	}

	public void lighten(double percent){
		for (int i = 0; i < 3; i++){
			colors[i] *= 1.f + (percent/100);
		}

		correctColor();
	}

	public void darken(double percent){
		lighten(percent * -1);
	}

	public Color blendColor(Color otherColor){
		int[] newColors = otherColor.getColors();

		for (int i = 0; i < 3; i++){
			newColors[i] = (newColors[i] + colors[i])/2;
		}

		return new Color(newColors[0], newColors[1], newColors[2]);	
	}

	public String toString(){
		String value = new String("[" + colors[0] + ", " + colors[1] + ", " + colors[2] + "]");
		
		return value;
	}

	private void correctColor(){
		for (int i = 0; i < 3; i++){
			if(colors[i] > 255){
				colors[i] = 255;
			} else if (colors[i] < 0){
				colors[i] = 0;
			}
		}
	}

}
