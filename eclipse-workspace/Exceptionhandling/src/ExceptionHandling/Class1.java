package ExceptionHandling;
import java.util.TreeSet;

public class Class1 {
	public static void main(String[] args) {
	
TreeSet<String>teja=new TreeSet<String>();
System.out.println("programme started");
teja.add("thulasi");
teja.add("ramlal");
try {
teja.add(null);
}
catch(Exception n)
{
	System.out.println("Kaveri");
}
finally {
	System.out.println("finally block");
}
System.out.println("programee ended");
//System.out.println(teja);

	}

}
