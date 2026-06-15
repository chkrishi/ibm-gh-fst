package Activity5;

public class details {

	public static void main(String[] args) {
		Book b1 = new MyBook();
		b1.setTitle("7 deadly sins");
		String returnTitle = b1.getTitle();
		System.out.println(returnTitle);
	}

}
