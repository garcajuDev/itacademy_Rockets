
public class Main {

	public static void main(String[] args) {
		Rocket rocket1 = new Rocket("32WESSDS",10,30,80);
		Rocket rocket2 = new Rocket("LDSFJA32",30,40,50,50,30,10);
		
		System.out.println("Rocket 1: "+ rocket1.getCode()+ " --> Amount of propulsors: " 
			+ rocket1.getAmountPropulsors() + " | Max Power of Propulsors:" + rocket1.getMaxPower());
		System.out.println("Rocket 2: "+ rocket2.getCode()+ " --> Amount of propulsors: " + rocket2.getAmountPropulsors()
			+ " | Max Power of Propulsors:" + rocket2.getMaxPower());
		
		System.out.println("\n" + rocket1.getCode());
		System.out.println(rocket2.getCode());
		
		rocket1.speedUp();
		rocket1.speedUp();
		rocket1.speedUp();
		rocket1.getSpeed();
		rocket1.speedUp();
		rocket1.speedUp();
		rocket1.speedUp();
		rocket1.speedUp();
		rocket1.getSpeed();
		rocket1.speedUp();
		rocket1.speedUp();
		rocket1.speedUp();
		rocket1.breakDown();
		rocket1.breakDown();
		rocket1.getSpeed();
		rocket1.breakDown();
		rocket1.breakDown();
		rocket1.breakDown();
		rocket1.getSpeed();
		rocket1.breakDown();
		rocket1.breakDown();
		rocket1.breakDown();
		rocket1.getSpeed();
		rocket1.breakDown();
		rocket1.breakDown();
		
		
	}

}
