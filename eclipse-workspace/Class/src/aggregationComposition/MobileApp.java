package aggregationComposition;

public class MobileApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------------------------");
		Charger teja2 = new Charger();
		System.out.println("Charger: "+teja2.colour);
		System.out.println("Charger: "+teja2.volts);
		teja2.charge();
		Mobile teja= new Mobile();
		teja = null;
		System.out.println("--------------------------");
		System.out.println("Mobile: "+teja.Brand);
		System.out.println("Mobile: "+teja.cost);
		teja.myMobile();
		System.out.println("--------------------------");
		System.out.println("Os: "+teja.os.osName);
		System.out.println("Os: "+teja.os.version);
		teja.os.enableWorking();
		System.out.println("*******************************");
		System.out.println("--------------------------");
		System.out.println("Mobile: "+teja.Brand);
		System.out.println("Mobile: "+teja.cost);
		teja.myMobile();
		System.out.println("--------------------------");
		System.out.println("Os: "+teja.os.osName);
		System.out.println("Os: "+teja.os.version);
		teja.os.enableWorking();

	}

}
