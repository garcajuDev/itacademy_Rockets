
public class Propulsor {
	private int[] power;
	
	public Propulsor(int power1,int power2,int power3) {
		this.power = new int[]{power1, power2, power3};
	}
	public Propulsor(int power1,int power2, int power3, int power4, int power5, int power6) {
		this.power = new int[]{power1, power2, power3, power4, power5, power6};
	}
	
	public int[] getPropulsors() {
		return this.power;
	}
	
	
	
}
