
import org.junit.Assert;
import org.junit.Test;
import praktikum.*;
import java.util.ArrayList;
import java.util.List;

public class BurgerTest {

    @Test
    public void checkAddIngredient(){
        Burger burger = new Burger();
        Ingredient ingredient = new Ingredient(IngredientType.FILLING,"dinosaur", 200);
        Assert.assertNotNull(ingredient);
    }

    @Test
    public void checkRemoveIngredient(){
        Burger burger = new Burger();
    }

    @Test
    public void checkMoveIngredient() {
        Burger burger = new Burger();
    }
}
