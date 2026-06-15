package Activity7;
import java.util.Scanner;

public class BicycleParts {
	int tyres;
	int maxSpeed;
	Scanner sc = new Scanner(System.in);
	void setSpeed() {
		System.out.println("Enter Max speed on bicycle: ");
		maxSpeed = sc.nextInt();		
	}
	void setTotalTyres() {
		System.out.println("Enter total Tyres on bicycle: ");
		tyres = sc.nextInt();		
	}
}

//In BicycleParts:
//public int tyres: number of tyres on the bicycle
//public int maxSpeed: max speed of bicycle