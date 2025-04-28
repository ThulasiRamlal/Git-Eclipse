package Oops1;

public interface FunctionalInterface1 {
	

}
//Predicate interface--> predicate interface is Functional Interface and 
//passing in single argument then check condition 
//and finally it returns in boolean result
@FunctionalInterface
interface Predicate<I>{
	public boolean predicate(int a);
}


//Supply interface such as functional interface which not passing any argument
//and no return but it supplied result
//it contains get() method
@FunctionalInterface
interface Supply<i>{
	public void get();
}

//Consumer interface--> Consumer interface such as functional interface
//whch pasing an argument and  return.
//2)it's mainly used using in Printing,loging opertions
//3)it contain accept() method
@FunctionalInterface
interface Consumer<I>{
	public String accept(String name);
}

//Function interface -->Functional INterface such as functional interface
//passig argument and return,contains apply() function
@FunctionalInterface
interface Function<I,i>{
	public int apply(int i);
}
