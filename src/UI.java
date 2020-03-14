
import java.util.Scanner;

public class UI {

	public static double volts[] = new double[3];
	public static double amps[] = new double[3];
	static double resistance[] = new double[3];
	static Scanner scanner = new Scanner(System.in);
	private static valuesCalculator vMinMax = new valuesCalculator(UI.volts);
	private static valuesCalculator iMinMax = new valuesCalculator(UI.amps);
	private static valuesCalculator rMinMax = new valuesCalculator(UI.resistance);

	public static void initialiseSystem() {

		System.out.println("Enter 3 pairs of V and I");

		for (int count = 0; count < 3; count++) {

			volts[count] = collectData("Volts");
			amps[count] = collectData("Amps");
			resistance[count] = volts[count] / amps[count];

			System.out.println("Resistance R is " + resistance[count] + " ohms\n");
		}
		
		System.out.println(valuesCalculator.toString("Volts",vMinMax.getAvg(),vMinMax.getMax(),vMinMax.getMin()));
		System.out.println(valuesCalculator.toString("Ampares",iMinMax.getAvg(),iMinMax.getMax(),iMinMax.getMin()));
		System.out.println(valuesCalculator.toString("Resistance",rMinMax.getAvg(),rMinMax.getMax(),rMinMax.getMin()));

	}

	private static double collectData(String type) {

		double input = 0;
		System.out.printf("Enter " + type + "(" + String.valueOf(type.toUpperCase().charAt(0)) + ") in " + type +": ");
		try {

			input = Double.parseDouble(scanner.nextLine());

		} catch (NumberFormatException nfe) {

			System.out.println("You did not enter a number!");

		}
		return input;

	}

	

}
