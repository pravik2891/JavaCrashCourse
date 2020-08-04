package conditionalStatements;

public class Masshero {
	String Superhero = "Thor" ;
	
	public void guessmyhero() {
		
		if ("Bat man".equals(Superhero)) {System.out.println("yor choice is Bat man");
			
		}else if ("Thor".equals(Superhero)) {
			System.out.println("your choice is Thor");
		}else {
			System.out.println("sorry i dont guess your choice");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Masshero hero = new Masshero();
		hero.guessmyhero();
		

	}

}
