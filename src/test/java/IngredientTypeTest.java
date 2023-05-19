import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.IngredientType;

@RunWith(MockitoJUnitRunner.class)
public class IngredientTypeTest {

    IngredientType sauce = IngredientType.SAUCE;
    IngredientType filling = IngredientType.FILLING;

    @Test
    public void checkSauceNotNull(){
       Assert.assertNotNull(String.valueOf(sauce));
    }

   @Test
   public void checkFillingNotNull(){
       Assert.assertNotNull(String.valueOf(filling));
   }

   @Test
   public void checkSauceAndNameSauce(){
       Assert.assertEquals("SAUCE", sauce.name());
   }

    @Test
    public void checkFillingAndNameSauce(){
        Assert.assertEquals("FILLING", filling.name());
    }

}
