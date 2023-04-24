import org.junit.Assert;
import org.junit.Test;
public class MainClassTest extends MainClass {
   String str = this.getClassString();
   int index1 = str.lastIndexOf("Hello");
   int index2 =str.lastIndexOf("hello");
    @Test
    public void testGetClassString() {
        if (index1 != -1){
            System.out.println("Искомая подстрока найдена");
    }
        else if (index2 != -1) {
            System.out.println("Искомая подстрока найдена");
        }
        else {
            System.out.println("Искомая подстрока не найдена");
            Assert.fail();
        }
}
}
