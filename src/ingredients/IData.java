package ingredients;

import java.util.List;

public interface IData {
	List<String> getAllIngredients();
	String getIngredientName(int id) throws IngredientNotFoundException;
	int getIngredientAmount(int id) throws IngredientNotFoundException;
	void setIngredientName(int id, String name) throws IngredientNotFoundException;
	void setIngredientAmount(int id, int amount) throws IngredientNotFoundException;
	void createIngredient(int id, String name, int amount);
	
}
