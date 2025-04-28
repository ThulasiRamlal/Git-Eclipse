package com.interfaceTypes;

public interface InterfaceType2 {
	
	

}
@FunctionalInterface
interface Predict<Integer>{
	public boolean Predict(Integer name);
}
@FunctionalInterface
interface Supply1<String>{
	public String toGet();
}

@FunctionalInterface
interface Consumer1<String>{
	public String toAccept(String name);
}

@FunctionalInterface
interface Function1<R,r>{
	public Integer ramlal(Integer r, Integer  R);
}