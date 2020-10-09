import java.util.*;

public class LogTable {

	public static void main (String[] args) {

		System.out.println("<html>\n<body>\n<table>\n<tr><th>x</th><th>ln(x)</th></tr>");

		for(double i = 0.1; i <= 2.0; i += 0.1){
			double logx = Math.log(i);

			System.out.println("<tr><td>" + i + "</td><td>" + logx + "</td></tr>");
		}

		System.out.println("</table>\n</body>\n</html>");
		
	}

}
