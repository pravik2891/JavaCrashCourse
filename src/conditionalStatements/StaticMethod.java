package conditionalStatements;

public class StaticMethod {
	
	public static void getstatic() {
		System.out.println("ststic is mentioned");
	}
	public void getnonstatic() {
		System.out.println("non static is mentioned");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticMethod staticme = new StaticMethod();

		getstatic();
		staticme.getnonstatic();
		
	}

}
