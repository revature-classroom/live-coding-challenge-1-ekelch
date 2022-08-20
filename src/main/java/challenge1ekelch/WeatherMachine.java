package challenge1ekelch;

public class WeatherMachine {
	
	Thermometer thermometer = new Thermometer();
	int pastTemperatureCount; //number of past temperatures to generate
	int[] pastTemperatures;
	
	
	public WeatherMachine(int pastTemperatureCount) {
		super();
		this.pastTemperatureCount = pastTemperatureCount;
		pastTemperatures = new int[pastTemperatureCount];
	}

	
	public void getWeatherReport() {
		int[] pastTemps = getPastTemperatures();
		for (int i = 0; i < pastTemps.length; i++) {
			System.out.println(displayTime(i) + " - " + pastTemps[i]);
		}
	}
	
	private int[] getPastTemperatures() {
		for (int i = 0; i < pastTemperatureCount; i++) {
			pastTemperatures[i] = thermometer.genValue();
		}
		return pastTemperatures;
	}
	
	private String displayTime(int pastTemperatureCount) {
		Integer time24hr = pastTemperatureCount % 24;
		String timeString = time24hr.toString() + ":00";
		return timeString;
	}
	
	
}
