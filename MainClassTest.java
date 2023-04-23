import org.junit.Assert;
import org.junit.Test;
public class MainClassTest {
    MainClass n = new MainClass();
    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("Полученное число не больше 40",n.getClassNumber()>45);
    }

}
