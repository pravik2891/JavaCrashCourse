package conditionalStatements;

public class Staticvari {
	
	static int accountbalance= 0;
	String accountholder;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Staticvari varia = new Staticvari();
		varia.accountbalance= 1000;
		varia.accountholder= "Pravin";
		
		
		Staticvari Varia2 = new Staticvari();
		Varia2.accountbalance= 2000;
		Varia2.accountholder= "Kumar";
		
		System.out.println("balance"+varia.accountbalance);
		System.out.println("name"+varia.accountholder);
		System.out.println("balance2"+Varia2.accountbalance);
		System.out.println("holdname"+Varia2.accountholder);
		
		
		

	}

}
