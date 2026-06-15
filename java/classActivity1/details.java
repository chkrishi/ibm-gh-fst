package classActivity1;

public class details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boy b1 = new Boy();
		Boy b2 = new Boy();
		Boy b3 = new Boy();
		
		Girl g1 = new Girl();
		Girl g2 = new Girl();
		Girl g3 = new Girl();
		
		Robot r1 = new Robot();
		Robot r2 = new Robot();
		Robot r3 = new Robot();
		
		int total = Girl.count + Boy.count;
		
		System.out.println("Total Humans: " + total );
		System.out.println("Total Robots: "+ Robot.count);
	}

}
