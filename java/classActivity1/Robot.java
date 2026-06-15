package classActivity1;

public class Robot {
	static int count = 0;
	Robot(){
		count += 1;
	}
	void talking() {
		System.out.println("Hello World");
	}
	void walking() {
		System.out.println("Fastest walking entity");
	}
}
