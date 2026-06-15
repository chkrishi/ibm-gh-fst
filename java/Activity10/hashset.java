package Activity10;
import java.util.HashSet;
import java.util.Scanner;

public class hashset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> hs = new HashSet<String>();
		for(int i = 0; i < 6; i++) {
			String val0 = sc.nextLine();
			hs.add(val0);
		}
		System.out.println("Size of hashset is: "+ hs.size());
		System.out.println("Enter name to remove from hashset: ");
		String val2 = sc.nextLine();
		hs.remove(val2);
		hs.remove("invalid");
		System.out.println("Enter name to search in hashset: ");
		String val = sc.nextLine();
		System.out.println(hs.contains(val));
		
		System.out.println(hs);
	}
	
}

//Create a HashSet named hs.
//Add 6 objects using add() method to the HashSet.
//Then print the size of the HashSet using the size() method.
//Remove an element using the remove() method.
//Also try to remove an element that is not present in the Set.
//Use the contains() method to check if an item is in the Set or not.
//Print the updated set.