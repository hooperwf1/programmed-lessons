public class Trigonometry {

	public static void main(String[] args){

		double cos, sin, sum, x = 30;

		x *= Math.PI/180;

		cos = Math.cos(x);
		sin = Math.sin(x);

		sum = (cos * cos) + (sin * sin);

		System.out.println("sine: " + sin + " cosine: " + cos + " sum of squares: " + sum );

	}

}
