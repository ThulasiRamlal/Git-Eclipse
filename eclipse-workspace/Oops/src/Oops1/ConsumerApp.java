package Oops1;

public class ConsumerApp {
	public static void main(String[] args) {
		Consumer<String>teja=(name)->"my name: "+name;
	   System.out.println(teja.accept("Ramlal"));
		}
	}


