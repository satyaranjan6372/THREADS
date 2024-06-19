package array;

public class Department {
	int id=10;
	String name="satya";
	int age =29;
	public static void main(String[] args) throws Exception {
		Class c=Class.forName("array.Department");
		Department d=(Department)c.newInstance();
		
		System.out.println(d.id);
		System.out.println(d.name);
		System.out.println(d.age);
		
	}

}