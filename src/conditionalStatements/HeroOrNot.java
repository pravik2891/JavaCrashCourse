package conditionalStatements;

public class HeroOrNot {

	String hero = "captain america";

	public void heroOrNot() {
		
		switch (hero) {
		case "superman":
			System.out.println("yes no");
			break;
		case "batman":
			System.out.println("yes no");
			break;
		case "captain america":
			System.out.println("yes right");
			break;

		default:
			System.out.println("bye bye");
			break;
		}
		
		}
	
	
	
	
		
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		HeroOrNot myhero = new HeroOrNot();
		myhero.heroOrNot();
		

		
	}

}
