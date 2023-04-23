import org.junit.Assert;
import org.junit.Test;
public class MainClassTest {
    MainClass n = new MainClass();
    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("Условие не выполнено",n.getLocalNumber()==14);
    }

}
