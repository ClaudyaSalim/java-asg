import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	Scanner scan = new Scanner (System.in);
	ArrayList<Shoe> shoes = new ArrayList<>();
	Validation validate = new Validation();
	
	public void viewShoes() {
		if(shoes.isEmpty()) {
			System.out.println("No shoes available");
			return;
		}
				
		for(int i = 1; i <= shoes.size(); i++) {
			System.out.println(i + " " + shoes.get(i-1));
		}
	}
	
	public void deleteShoe() {
		
		int index = -1;
		int size = shoes.size();
		boolean isValidIndex = true;
		
		do {
			isValidIndex = true;
			System.out.printf("Choose shoe's number to delete[1..%d]: ", size);
			index = scan.nextInt(); scan.nextLine();
			if (index < 1 || index > size) {
				isValidIndex = false;
			}
		} while (!isValidIndex);
		
		shoes.remove(index-1);
		System.out.println("Shoe removed!");
		
	}
	
	public void addShoe() {
		
		String name, category, releaseDate;
		Integer price;
		
		do {
			System.out.print("Input shoe's name[name ends with shoe, example: \"Fire shoe\"]: ");
			name = scan.nextLine();
		} while (!validate.shoeName(name));
		
		do {
			System.out.print("Input shoe's category[Sneaker | Running | Boot] (case sensitive): ");
			category = scan.nextLine();
		} while(!validate.shoeCategory(category));
		
		do {
			System.out.print("Input shoe's release date[dd-mm-yyy]: ");
			releaseDate = scan.nextLine();
			
		} while (!validate.shoeRelease(releaseDate));
		
		do {
			System.out.print("Input shoe's price[more than or equals to 5000]: ");
			price = scan.nextInt(); scan.nextLine();
		} while (!validate.shoePrice(price));
		
		Shoe newShoe = new Shoe (name, category, releaseDate, price);
		shoes.add(newShoe);
		System.out.println("Shoe added!");
	}
	
	
	public Main(boolean onApp) {
		while(onApp) {
			System.out.println("Shoe Shop");
			System.out.println("=========");
			System.out.println("1. View Shoes");
			System.out.println("2. Add Shoe");
			System.out.println("3. Delete Shoe");
			System.out.println("4. Exit");
			
			int choice = -1;
			boolean isValidChoice = true;
			
			do {
				isValidChoice = true;
				System.out.print(">> ");
				choice = scan.nextInt(); scan.nextLine();
				
				if(choice < 1 || choice > 4) {
					isValidChoice = false;
				}
			} while (!isValidChoice);
			
			switch(choice) {
			case 1:
				viewShoes();
				System.out.println("Press enter to continue..");
				scan.nextLine();
				break;
			case 2:
				addShoe();
				System.out.println("Press enter to continue..");
				scan.nextLine();
				break;
			case 3:
				viewShoes();
				if(shoes.size()!=0) {
					deleteShoe();
				}
				System.out.println("Press enter to continue..");
				scan.nextLine();
				break;
			case 4:
				System.out.println("Thank you for using this application!");
				onApp = false;
				break;
			}
		}
	}

	public static void main(String[] args) {

		new Main(true);
	}

}
