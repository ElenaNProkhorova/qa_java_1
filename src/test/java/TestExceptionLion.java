import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestExceptionLion {
    String sex;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"unknown"},
                {null},
                {"Не самец"},
                {"Не самка"}
        };
    }

    public TestExceptionLion(String sex) {
        this.sex = sex;
    }

    @Test(expected = Exception.class)
    public void exceptionLionTest() throws Exception {
        new Lion(sex, null);
    }
}