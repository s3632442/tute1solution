

public class valuesCalculator {

	private double min;
	private double max;
	private double avg;

	public  valuesCalculator(double... vals) {
		this.max = vals[vals.length - 1];
		this.min = vals[vals.length - 1];
		this.avg = vals[vals.length - 1];
		for (int i = vals.length - 2; i >= 0; i--) {

			if (this.min > vals[i]) {
				this.min = vals[i];
			}

			if (this.max < vals[i]) {
				this.max = vals[i];
			}
			
			this.avg =+vals[i];
		}
		
		this.avg /= vals.length;

	}

	public double getMin() {
		return this.min;
	}

	/*
	 * public void setMin(double min) { this.min = min; }
	 */

	public double getMax() {
		return this.max;
	}

	/*
	 * public void setMax(double max) { this.max = max; }
	 */
	
	public double getAvg() {
		return avg;
	}

	/*
	 * public void setAvg(double avg) { this.avg = avg; }
	 */
	
	public static String toString(String type, double avg, double min, double max) {


		return String.format("%s (%s) .. Avg=%s, Max=%s, Min=%s\n",
				String.valueOf(type.toUpperCase().charAt(0)), 
				type, avg, min, max);
		
	}

}
