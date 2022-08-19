package challenge1ekelch;

public class Thermometer {

	double seed;
	int max = 108;
	int seedValue;
	
	public int genSeed() {
		seed = Math.random();
		seedValue = (int) (seed * max);
		return seedValue;
	}
	
}
