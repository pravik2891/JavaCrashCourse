package conditionalStatements;

public class Staticvariable {
	static int accountbalance = 0;
	String depositby;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Staticvariable object1 = new Staticvariable();
		object1.accountbalance=1000;
		object1.depositby="danny";
		
		System.out.println("accountbalance is " + accountbalance );
		System.out.println("deposited by");
	}

}
