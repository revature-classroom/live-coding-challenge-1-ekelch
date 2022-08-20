package challenge1ekelch;

public class Thermometer {

	double seed;
	int max = 109;
	int seedValue;
	
	public int genValue() {
		seed = Math.random();
		seedValue = (int) (seed * max);
		return seedValue;
	}
	
}
