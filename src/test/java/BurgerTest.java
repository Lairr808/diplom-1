
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.*;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;

    @Test
    public void checkSetBuns(){
        Burger burger = new Burger();
        burger.setBuns(bun);
        Assert.assertEquals(bun, burger.bun);
    }

    @Test
    public void checkAddIngredient(){
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        Assert.assertNotNull(burger.ingredients);
    }
    @Test
    public void checkRemoveIngredient(){
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        Assert.assertFalse(burger.ingredients.contains(ingredient));
    }
    @Test
    public void checkMoveIngredient() {
        Burger burger = new Burger();
        burger.addIngredient(new Ingredient(IngredientType.SAUCE,"sour cream", 200));
        burger.addIngredient(new Ingredient(IngredientType.FILLING,"sausage", 300));
        burger.moveIngredient(0,1);
        Assert.assertEquals("sour cream", burger.ingredients.get(1).name);
    }

    @Test
    public void checkReceiptTest(){
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        burger.setBuns(bun);
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.SAUCE);
        Mockito.when(ingredient.getName()).thenReturn("Соус Spicy-X");
        Mockito.when(bun.getName()).thenReturn("Флюоресцентная булка R2-D3");

        String expected = "(==== Флюоресцентная булка R2-D3 ====)\r\n" +
                "= sauce Соус Spicy-X =\r\n" +
                "(==== Флюоресцентная булка R2-D3 ====)\r\n" +
                "\r\nPrice: 0,000000\r\n";

        String actual = burger.getReceipt();
        assertEquals(expected, actual);
    }
}
