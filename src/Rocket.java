
public class Rocket {
	private String code;
	Propulsor propulsors;
	private int[] powerInit;
	
	public Rocket(String code, int power1, int power2, int power3) {
		this.code = code;
		this.propulsors = new Propulsor(power1, power2, power3);
		this.powerInit = new int[] {0,0,0};
	}
	
	public Rocket(String code, int power1, int power2, int power3, int power4, int power5, int power6) {
		this.code = code;
		this.propulsors = new Propulsor(power1, power2, power3, power4, power5, power6);
		this.powerInit = new int[] {0,0,0,0,0,0};
	}

	public String getCode() {
		return this.code;
	}
	
	public int getAmountPropulsors() {	 
		int prop[] = propulsors.getPropulsors();
		int i = 0;
		for(int power : prop) i++;
		return i;
	}
	
	public String getMaxPower() {
		int prop[] = propulsors.getPropulsors();
		String result = "";
		for(int power : prop) {
			result += " " + power;
		}
		return result;
	}
	
	public void speedUp() {
		int maxPower[] = this.propulsors.getPropulsors();
		for(int i = 0; i < maxPower.length; i++) {
			if(powerInit[i] < maxPower[i]) powerInit[i]+= 10;
			System.out.print(" "+powerInit[i]);
		}
		System.out.println();
	}
	
	public void breakDown() {
		int minPower[] = {0,0,0};
		for(int i = 0; i < minPower.length; i++) {
			if(powerInit[i] > minPower[i]) powerInit[i]-= 10;
			System.out.print(" "+powerInit[i]);
		}
		System.out.println();
	}
	
	public void getSpeed() {
		int actualSpeed = 0;
		for(int pow : this.powerInit) actualSpeed += pow;
		System.out.println("Actual speed: " + actualSpeed);
	}
}
