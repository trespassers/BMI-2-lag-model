package ingredients;

import java.util.ArrayList;
import java.util.List;

public class DemoData implements IData {
	private class Ingredient {
		int id;
		String name;
		int amount;
		
		Ingredient(int id, String name, int amount) {
			this.id = id;
			this.name = name;
			this.amount = amount;
		}
		
		public String toString() {
			return "Ingredient: " + id + "; " + name + " - Amount: " + amount;
		}
	}
	
	private List<Ingredient> ingredients;
	
	public DemoData( ) {
		ingredients = new ArrayList<>();
		ingredients.add(new Ingredient(1, "flormelis", 60));
		ingredients.add(new Ingredient(2, "mel", 240));
		ingredients.add(new Ingredient(3, "smør", 185));
	}

	@Override
	public List<String> getAllIngredients() {
		List<String> allIngredients = new ArrayList<String>();
		for(int i = 0; i < ingredients.size(); i++) {
			String ingredient = ingredients.get(i).name;
			allIngredients.add(ingredient);
		}
		return allIngredients;
	}

	@Override
	public String getIngredientName(int id) {
		return ingredients.get(id-1).name;
	}

	@Override
	public int getIngredientAmount(int id) {
		return ingredients.get(id-1).amount;
	}

	@Override
	public void setIngredientName(int id, String name) {
		ingredients.get(id-1).name = name;
		
	}

	@Override
	public void setIngredientAmount(int id, int amount) {
		ingredients.get(id-1).amount = amount;
		
	}

	@Override
	public void createIngredient(int id, String name, int amount) {
		ingredients.add(new Ingredient(id, name, amount));
		
	}
}
