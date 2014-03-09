import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SimpleCalc {

	public static void main(String[] args) {
		String firstValue = getInput("Enter the first value: ");
		String secondValue = getInput("Enter the second value: ");
		
		double dFirstValue = Double.parseDouble(firstValue);
		double dSecondValue = Double.parseDouble(secondValue);
		
		double result = dFirstValue + dSecondValue;
		
		System.out.println(result);
	}

	private static String getInput(String string) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(string);
		System.out.flush();
		
		try {
			return stdin.readLine();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}

}
