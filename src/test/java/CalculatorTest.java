import lv.acodemy.classroom.Lesson4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator casio = new Calculator("Casio", "G-Shock");
    @Test
    public void testSum() {
        Assert.assertEquals(casio.sum(10,5), 15);
    }
    @Test
    public void testDivide() {
        Assert.assertEquals(casio.divide(10,5), 2);
    }
    @Test
    public void testSubtract() {
        Assert.assertEquals(casio.subtract(10,5), 5);
    }
    @Test
    public void testMultiply() {
        Assert.assertEquals(casio.multiply(10,5), 50);
    }
    @Test
    public void testSquareNumber() {
        Assert.assertEquals(casio.squareNumber(10, 10), 100);
    }
    @Test
    public void testSetName() {
        casio.setName("NewCasio");
        Assert.assertEquals(casio.getName(), "NewCasio");
    }
    @Test
    public void testSetModelName() {
        casio.setModelName("XXXX");
        Assert.assertEquals(casio.getModelName(), "XXXX");
    }
    @Test
    public void testToString() {

        String toString = "Calculator{" +
                "name='" + casio.getName() + '\'' +
                ", modelName='" + casio.getModelName() + '\'' +
                '}';

        Assert.assertEquals(toString, casio.toString());
    }
}
