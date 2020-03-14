

public class Elec_Calculator {

	public static void main(String[] args) {
		UI.initialiseSystem();
		valuesCalculator vMinMax = new valuesCalculator(UI.volts);
		valuesCalculator iMinMax = new valuesCalculator(UI.amps);
		valuesCalculator rMinMax = new valuesCalculator(UI.resistance);
		
		
		
		System.out.println(valuesCalculator.toString("Volts",vMinMax.getAvg(),vMinMax.getMax(),vMinMax.getMin()));
		System.out.println(valuesCalculator.toString("Ampares",iMinMax.getAvg(),iMinMax.getMax(),iMinMax.getMin()));
		System.out.println(valuesCalculator.toString("Resistance",rMinMax.getAvg(),rMinMax.getMax(),rMinMax.getMin()));
		
	}
}
