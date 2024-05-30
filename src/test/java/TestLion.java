import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class TestLion {

    private String sex = "Самец";

    @Mock
    Feline feline;

    @Test
    public void lionGetKittensTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        when(feline.getKittens()).thenReturn(1);
        int actual = lion.getKittens();
        Assert.assertEquals(1, actual);
    }

    @Test
    public void lionGetFoodTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        lion.getFood();
        List<String> foodList = List.of("Животные", "Птицы", "Рыба");
        when(feline.getFood("Хищник")).thenReturn(foodList);
        List<String> eatList = lion.getFood();
        Assert.assertEquals(foodList, eatList);
    }
}
