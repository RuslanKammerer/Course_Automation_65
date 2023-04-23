import org.junit.Assert;
import org.junit.Test;
public class MainClassTest {
    MainClass b = new MainClass();
    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("Условие сравненения не выполнено",b.getClassNumber()==45);
    }

}
