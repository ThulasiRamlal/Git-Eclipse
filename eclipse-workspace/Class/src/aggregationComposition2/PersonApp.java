package aggregationComposition2;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person teja = new Person();
		System.out.println("id: "+teja.id);
		System.out.println("name: "+teja.name);
		System.out.println("gender: "+teja.gender);
		teja.eat();
		teja.walk();
		
		System.out.println("-----------------------------");
		System.out.println("Brain "+teja.br.colour);
		System.out.println("Brain: "+teja.br.weight);
		teja.br.thinks();
		
		System.out.println("-----------------------------");
		System.out.println("Human: "+teja.hr.heartBeat);
		System.out.println("Human: "+teja.hr.weight);
		teja.hr.pumpBlood();
		
		System.out.println("--------------------------");
		
		Book bk = new Book();
		System.out.println("Book: "+bk.authorName);
		System.out.println("Book: "+bk.Name);
		bk.userReads();
		
		System.out.println("----------------------------");
		Bike bike =new Bike();
		System.out.println("Bike: "+bike.brand);
		System.out.println("Bike: "+bike.engNo);
		bike.userRiding();
		
		
		

	}

}
