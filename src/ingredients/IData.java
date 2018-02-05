package ingredients;

import java.util.List;

public interface IData {
	List<String> getAllIngredients();
	String getIngredientName(int id);
	int getIngredientAmount(int id);
	void setIngredientName(int id, String name);
	void setIngredientAmount(int id, int amount);
	void createIngredient(int id, String name, int amount);
	
}
