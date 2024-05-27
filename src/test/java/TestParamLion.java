import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestParamLion {
    private String sex;
    private boolean hasMane;

    public TestParamLion(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void lionDoesHaveManeTest () throws Exception {
        //Feline feline = new Feline();
        Lion lion = new Lion(this.sex, null);
        boolean actualMane = lion.doesHaveMane();
        Assert.assertEquals(this.hasMane, actualMane);
    }
}
