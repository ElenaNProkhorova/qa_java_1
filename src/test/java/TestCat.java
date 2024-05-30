import com.example.Cat;
import com.example.Feline;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    private Cat cat;

    @Before
    public void setup() {
        cat = new Cat(feline);
    }

    @Mock
    Feline feline;

    @Test
    public void catGetSoundTest() {
        MatcherAssert.assertThat(cat.getSound(), containsString("Мяу"));
    }

    @Test
    public void catGetFoodTest() throws Exception {
        cat.getFood();
        List<String> foodList = List.of("Животные", "Птицы", "Рыба");
        when(feline.eatMeat()).thenReturn(foodList);
        List<String> eatList = cat.getFood();
        Assert.assertEquals(foodList, eatList);
    }
}
