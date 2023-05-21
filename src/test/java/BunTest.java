import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.*;

@RunWith(Parameterized.class)
public class BunTest {

    private final String name;
    private final float price;

    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData(){
        return new Object[][]{
                {"black bun", 100},
                {null, 200},
                {"", 300},
                {"fghfxhtfgvcserfcwerawesxqweveerdeqaxeweqwqw", 300},
                {"#", 300},
                {"red bun", -300},
                {"red bun", 0},
                {"red bun", -1},
                {"red bun", 3.4E+38f},
                {"red bun", Float.MIN_VALUE},
        };
    }

    @Test
    public void checkGetNameBun(){
        Bun bun = new Bun(name, price);
        Assert.assertEquals(name, bun.getName());
    }

    @Test
    public void checkGetPriceBun(){
        Bun bun = new Bun(name, price);
        Assert.assertEquals(price, bun.getPrice(), 0);
    }

}
