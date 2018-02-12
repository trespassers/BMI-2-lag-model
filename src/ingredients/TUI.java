package ingredients;

import java.util.Scanner;

public class TUI implements IUI {
	private IData d;
	private Scanner sc = new Scanner(System.in);
	
	public TUI(IData d) {
		this.d = d;
	}

	@Override
	public void showMenu() {
		System.out.println("********************************");
		System.out.println("You're able to do the following:");
		System.out.println("1) Show all ingredients");
		System.out.println("2) Show one ingredient");
		System.out.println("3) Change statuses of an ingredient");
		System.out.println("4) Add an ingredient to the list");
		System.out.println("*********************************");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			showIngredients();
			break;
		case 2:
			showIngredient();
			break;
		case 3:
			changeIngredient();
			break;
		case 4:
			createIngredient();
			break;
		default:
			break;
		}
		
	}

	@Override
	public void showIngredients() {
		System.out.println(d.getAllIngredients());
		
	}

	@Override
	public void showIngredient() {
		System.out.println("Enter the id of the ingredient\nthat you would like to see");
		int id = sc.nextInt();
		try {
			System.out.println(d.getIngredientName(id));
		} catch (IngredientNotFoundException e) {
			System.out.println(e);
		}
	}

	@Override
	public void changeIngredient() {
		System.out.println("What would you like to change?");
		System.out.println("1 for name || 2 for amount");
		int choice = sc.nextInt();
		System.out.println("OK - Enter the id of the ingredient to change");
		int id = sc.nextInt();
		if(choice == 1) {
			try {
				System.out.print("Write new name ");
				String name = sc.next();
				d.setIngredientName(id, name);
			} catch (IngredientNotFoundException e) {
				System.out.println(e);
			}
		} else {
			try {
				System.out.print("Write new amount ");
				int amount = sc.nextInt();
				d.setIngredientAmount(id, amount);
			} catch (IngredientNotFoundException e) {
				System.out.println(e);
			}
		}
	}

	@Override
	public void createIngredient() {
		System.out.println("Enter the id of the ingredient");
		int id = sc.nextInt();
		System.out.println("Enter the name of the ingredient");
		String name = sc.next();
		System.out.println("Enter the desired amount of the ingredient");
		int amount = sc.nextInt();
		d.createIngredient(id, name, amount);
	}
}
