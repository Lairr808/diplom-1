import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;


@RunWith(Parameterized.class)
public class IngredientTest {

    private final IngredientType type;
    private final String name;
    private  final float price;


    public IngredientTest(IngredientType type,String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }
    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][]{
                {SAUCE, "hot sauce", 100},
                {SAUCE, "sour cream", 200},
                {SAUCE, "chili sauce", 300},
                {FILLING, "cutlet", 100},
                {FILLING, "dinosaur", 200},
                {FILLING, "sausage", 300},
        };
    }

    @Test
    public void checkGetTypeIngredient() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(type, ingredient.getType());
    }

    @Test
    public void checkGetNameIngredient(){
        Ingredient ingredient = new Ingredient(type,name,price);
        Assert.assertEquals(name , ingredient.getName());
    }

    @Test
    public void checkGetPriceIngredient(){
        Ingredient ingredient = new Ingredient(type,name,price);
        Assert.assertEquals(price , ingredient.getPrice(), 0);
    }
}
