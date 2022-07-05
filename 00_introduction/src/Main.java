import java.util.Scanner;

public class Main {
	
	Scanner scan = new Scanner (System.in);

	public Main() {
		
		int choice;
		
		System.out.println(" /$$$$$$$     /$$$$$                        /$$$$$ /$$$$$$$  /$$$$$$$$        /$$       /$$          \r\n"
				+ "| $$__  $$   |__  $$                       |__  $$| $$__  $$|__  $$__/       | $$      | $$          \r\n"
				+ "| $$  \\ $$      | $$                          | $$| $$  \\ $$   | $$  /$$$$$$ | $$$$$$$ | $$  /$$$$$$ \r\n"
				+ "| $$$$$$$       | $$       /$$$$$$            | $$| $$$$$$$/   | $$ |____  $$| $$__  $$| $$ /$$__  $$\r\n"
				+ "| $$__  $$ /$$  | $$      |______/       /$$  | $$| $$____/    | $$  /$$$$$$$| $$  \\ $$| $$| $$$$$$$$\r\n"
				+ "| $$  \\ $$| $$  | $$                    | $$  | $$| $$         | $$ /$$__  $$| $$  | $$| $$| $$_____/\r\n"
				+ "| $$$$$$$/|  $$$$$$/                    |  $$$$$$/| $$         | $$|  $$$$$$$| $$$$$$$/| $$|  $$$$$$$\r\n"
				+ "|_______/  \\______/                      \\______/ |__/         |__/ \\_______/|_______/ |__/ \\_______/\r\n"
				+ "                                                                                                     \r\n"
				+ "                                                                                                     \r\n"
				+ "                                                                                                     ");
		
		do {
			System.out.println("1. Start The Simulation!!");
			System.out.println("2. Close App");
			System.out.print("Choice >> ");
			choice = scan.nextInt();
			
			if(choice==1) {
				table();
			}
			
		} while (choice!=2);
		System.out.println("thank you for using the apps!!");
	}

	public static void main(String[] args) {
		new Main();
	}
	
	void table() {
		int num1;
		int num2;
		boolean p1;
		boolean p2;
		
		do {
			System.out.print("Input the first number [1 - 100](inclusive): ");
			num1 = scan.nextInt();
		} while(num1 < 1 || num1 > 100);
		
		do {
			System.out.print("Input the second number [1 - 100](inclusive): ");
			num2 = scan.nextInt();
		} while(num2 < 1 || num2 > 100);
		
		System.out.println("+=========================================================================================================================+");
		System.out.println("+  + (String type)  |  (Character Type)  |  * (Integer type)  |  / (Floating Type)  |  input 1 == input 2 (Boolean Type)  +");
		System.out.println("+=========================================================================================================================+");
		String string = num1 + " + " + num2;
		System.out.printf("+ %-18s", string);
		System.out.printf("| %8c   %-8c", num1, num2);
		System.out.printf("| %-19d", num1*num2);
		double d1 = num1;
		double d2 = num2;
		System.out.printf("| %-20.3f", d1/d2);
		System.out.printf("| %-36s+\n", num1==num2);
		System.out.println("+=========================================================================================================================+");
		System.out.println("Press enter to proceed..");
		scan.nextLine(); scan.nextLine();
		
		System.out.println("+===========================================================+");
		System.out.println("+Data Type : Integer                                        +");
		System.out.println("+===========================================================+");
		System.out.println("+     +     |     -     |     *     |     /     |     %     +");
		System.out.println("+===========================================================+");
		System.out.printf("+ %-10d", num1+num2);
		System.out.printf("| %-10d", num1-num2);
		System.out.printf("| %-10d", num1*num2);
		System.out.printf("| %-10d", num1/num2);
		System.out.printf("| %-10d+\n", num1%num2);
		System.out.println("+===========================================================+");
		System.out.println("Press enter to proceed..");
		scan.nextLine();
		
		do {
			System.out.print("Give me value for p1 [true | false]: ");
			p1 = scan.nextBoolean();
		} while(p1!=false && p1!=true);
		
		do {
			System.out.print("Give me value for p2 [true | false]: ");
			p2 = scan.nextBoolean();
		} while(p2!=false && p2!=true);
		
		System.out.println("+=====================================================================+");
		System.out.println("+Logical Table                                                        +");
		System.out.println("+=====================================================================+");
		
		System.out.print("+ P1 = ");
		if(p1==true) {
			System.out.print("T");
		}
		else {
			System.out.print("F");
		}
		
		System.out.print(" , P2 = ");
		if(p2==true) {
			System.out.print("T                                                     +\n");
		}
		else {
			System.out.print("F                                                     +\n");
		}
		System.out.println("+=====================================================================+");
		System.out.println("+       !P1       |       !P2       |       &&       |       ||       +");
		System.out.println("+=====================================================================+");
		System.out.printf("+ %-16s", !p1);
		System.out.printf("| %-16s", !p2);
		System.out.printf("| %-15s", p1&&p2);
		System.out.printf("| %-15s|\n", p1||p2);
		System.out.println("+=====================================================================+");
		System.out.println("Press enter to proceed..");
		scan.nextLine(); scan.nextLine();
	}
	
}
