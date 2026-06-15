package Activity9;
import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			String val0 = sc.nextLine();
			arr.add(val0);
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(arr.get(i));
		}
		System.out.println(arr.get(2));
		System.out.println("Enter name to search in array: ");
		String val = sc.nextLine();
		System.out.println(arr.contains(val));
		System.out.println("Size of array is: "+ arr.size());
		System.out.println("Enter name to remove from array: ");
		String val2 = sc.nextLine();
		arr.remove(val2);
		for(int i = 0; i < 5; i++) {
			System.out.println(arr.get(i));
		}
	}

}


//Activity 9
//In this exercise,
//
//Create an ArrayList named myList of type String.
//Add 5 names to the ArrayList using add() method.
//Then print all the names using for loop.
//Then use get() method to retrieve the 3rd name in the ArrayList.
//Use contains() method to check if a name exists in the ArrayList.
//Use size() method to print the number of names in the ArrayList.
//Use remove() method to remove a name from the list and print the size() of the list again.