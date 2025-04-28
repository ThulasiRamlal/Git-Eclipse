package AggregationComposition;

public class SchoolApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		School sc = new School();
		System.out.println(sc.sch_name);
		System.out.println(sc.Strength);
		sc.school();
		System.out.println("------------------------------");
		System.out.println(sc.st.stu_id);
		System.out.println(sc.st.stu_name);
		sc.st.schoolName();
		System.out.println("--------------------------------");
		Teacher tech = new Teacher();
		System.out.println(tech.tea_name);
		System.out.println(tech.subject);
		tech.teaching();
		
		System.out.println("---------------------------------");
		System.out.println(tech.tea_name);
		System.out.println(tech.subject);
		tech.teaching();
		
		
		
		System.out.println(sc.sch_name);
		System.out.println(sc.Strength);
		sc.school();
		System.out.println("------------------------------");
		System.out.println(sc.st.stu_id);
		System.out.println(sc.st.stu_name);
		sc.st.schoolName();
		System.out.println("--------------------------------");
	
		
		

	}

}
