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

	public DemoData() {
		ingredients = new ArrayList<>();
		ingredients.add(new Ingredient(1, "flormelis", 60));
		ingredients.add(new Ingredient(2, "mel", 240));
		ingredients.add(new Ingredient(3, "smør", 185));
	}

	@Override
	public List<String> getAllIngredients() {
		List<String> allIngredients = new ArrayList<String>();
		for (int i = 0; i < ingredients.size(); i++) {
			String ingredient = ingredients.get(i).name;
			allIngredients.add(ingredient);
		}
		return allIngredients;
	}

	@Override
	public String getIngredientName(int id) throws IngredientNotFoundException {
		for (Ingredient i : ingredients) {
			if (i.id == id)
				return i.name;
		}
		throw new IngredientNotFoundException();
	}

	@Override
	public int getIngredientAmount(int id) throws IngredientNotFoundException {
		for (Ingredient i : ingredients) {
			if (i.id == id)
				return i.amount;
		}
		throw new IngredientNotFoundException();
	}

	@Override
	public void setIngredientName(int id, String name) throws IngredientNotFoundException {
		boolean found = false;
		for (Ingredient i : ingredients) {
			if (i.id == id) {
				i.name = name;
				found = true;
				break;
			}
		}
		if(!found) {			
			throw new IngredientNotFoundException();
		}
	}

	@Override
	public void setIngredientAmount(int id, int amount) throws IngredientNotFoundException {
		boolean found = false;
		for (Ingredient i : ingredients) {
			if (i.id == id) {
				i.amount = amount;
				found = true;
			}
		}
		if(!found) {			
			throw new IngredientNotFoundException();
		}
	}

	@Override
	public void createIngredient(int id, String name, int amount) {
		ingredients.add(new Ingredient(id, name, amount));

	}
}
