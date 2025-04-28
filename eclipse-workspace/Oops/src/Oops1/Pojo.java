package Oops1;

public class Pojo {
	private int a;
	private String b;
	private float height;
	
	/*
	 * public void setId(int a) { this.a=a; } public int getId() { return a; }
	 * public void setName(String b) { this.b=b; } public void setHeight(float
	 * height) { this.height=height; }
	 */
	Pojo(int a,String b,float height)
	{
		this.a=a;
		this.b=b;
		this.height=height;
	}

	public void display()
	{
	
		System.out.println("id: "+a+" name: "+b+" height: "+height);
	}
	public String toString()
	{
		return("id: "+a+" name: "+b+" height: "+height);
	}
	public static void main(String[] args) {
		Pojo teja= new Pojo(10,"thulasi",12.5f);
	   teja.display();
	  System.out.println(teja.toString());
	}

}
