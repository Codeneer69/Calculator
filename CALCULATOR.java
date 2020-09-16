import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Scanner assign
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What do you want to do? \n");
		System.out.println("Choose any one of the following :- \n");
		System.out.println("1.add \n2.substract \n3.multiply \n4.divide");
		
		String ask = scan.nextLine();
	
		switch (ask){
			case "add":
				System.out.println("\nEnter the first number");
				int numb1 = scan.nextInt();
				System.out.println("\nEnter the second number");
				int numb2 = scan.nextInt();
				
				System.out.println("\nThe sum of these numbers is :- ");
				System.out.println(numb1+numb2);
				break;
		}
		
		switch (ask){
			case "addition":
				System.out.println("\nEnter the first number");
				int numb1 = scan.nextInt();
				System.out.println("\nEnter the second number");
				int numb2 = scan.nextInt();
				
				System.out.println("\nThe sum of these numbers is :- ");
				System.out.println(numb1+numb2);
				break;
		}
		
		switch (ask){
			case "Addition":
				System.out.println("\nEnter the first number");
				int numb1 = scan.nextInt();
				System.out.println("\nEnter the second number");
				int numb2 = scan.nextInt();
				
				System.out.println("\nThe sum of these numbers is :- ");
				System.out.println(numb1+numb2);
				break;
		}
		
		switch (ask){
			case "ADDITION":
				System.out.println("\nEnter the first number");
				int numb1 = scan.nextInt();
				System.out.println("\nEnter the second number");
				int numb2 = scan.nextInt();
				
				System.out.println("\nThe sum of these numbers is :- ");
				System.out.println(numb1+numb2);
				break;
		}
		
		switch (ask){
			case "sum":
				System.out.println("\nEnter the first number");
				int numb1 = scan.nextInt();
				System.out.println("\nEnter the second number");
				int numb2 = scan.nextInt();
				
				System.out.println("\nThe sum of these numbers is :- ");
				System.out.println(numb1+numb2);
				break;
		}
		
		switch (ask){
			case "Sum":
				System.out.println("\nEnter the first number");
				int numb1 = scan.nextInt();
				System.out.println("\nEnter the second number");
				int numb2 = scan.nextInt();
				
				System.out.println("\nThe sum of these numbers is :- ");
				System.out.println(numb1+numb2);
				break;
		}
		
		switch (ask){
			case "SUM":
				System.out.println("\nEnter the first number");
				int numb1 = scan.nextInt();
				System.out.println("\nEnter the second number");
				int numb2 = scan.nextInt();
				
				System.out.println("\nThe sum of these numbers is :- ");
				System.out.println(numb1+numb2);
				break;
		}
		
		switch (ask){
			case "Add":
				System.out.println("\nEnter the first number");
				int numb1 = scan.nextInt();
				System.out.println("\nEnter the second number");
				int numb2 = scan.nextInt();
				
				System.out.println("\nThe sum of these numbers is :- ");
				System.out.println(numb1+numb2);
				break;
		}
		
		switch (ask){
			case "ADD":
				System.out.println("\nEnter the first number");
				int numb1 = scan.nextInt();
				System.out.println("\nEnter the second number");
				int numb2 = scan.nextInt();
				
				System.out.println("\nThe sum of these numbers is :- ");
				System.out.println(numb1+numb2);
				break;
		}
	
		//substract 1
		switch (ask){
			case "substract":
				System.out.println("\nChoose any one option among the following :- ");
				System.out.println("\n1.You want to substract first number from the second number.");
				System.out.println("\n2.You want to substract second number from the first number.");
				int opt = scan.nextInt();
				
				switch(opt){
					case 1:
						System.out.println("\nEnter the first number");
						int numb1 = scan.nextInt();
						System.out.println("\nEnter the second number");
						int numb2 = scan.nextInt();
				
						System.out.println("\nThe answer  is :- ");
						System.out.println(numb2-numb1);
					break;
					
					case 2:
						System.out.println("\nEnter the first number");
						int num = scan.nextInt();
						System.out.println("\nEnter the second number");
						int num2 = scan.nextInt();
				
						System.out.println("\nThe answer  is :- ");
						System.out.println(num-num2);
						break;	
				}
				
		}
		
		// multiply
		switch (ask){
			case "multiply":
				System.out.println("\nEnter the first number");
				int numb1 = scan.nextInt();
				System.out.println("\nEnter the second number");
				int numb2 = scan.nextInt();
				
				System.out.println("\nThe product of these numbers is :- ");
				System.out.println(numb1*numb2);
				break;
		}
		
		// divide
		switch (ask){
			case "divide":
				
				System.out.println("\nChoose any one option among the following :- ");
				System.out.println("\n1.You want to divide first number by the second number.");
				System.out.println("\n2.You want to divide second number by the first number.");
				int opt = scan.nextInt();
				
				switch(opt){
					case 1:
						System.out.println("\nEnter the first number");
						int numb1 = scan.nextInt();
						System.out.println("\nEnter the second number");
						int numb2 = scan.nextInt();
				
						System.out.println("\nThe answer  is :- ");
						System.out.println(numb1/numb2);
					break;
					
					case 2:
						System.out.println("\nEnter the first number");
						int num = scan.nextInt();
						System.out.println("\nEnter the second number");
						int num2 = scan.nextInt();
				
						System.out.println("\nThe answer  is :- ");
						System.out.println(num2/num);
						break;		
			}	
		}
	}
}