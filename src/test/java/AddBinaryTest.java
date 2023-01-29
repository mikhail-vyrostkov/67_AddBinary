import junit.framework.TestCase;

public class AddBinaryTest extends TestCase {
    public void testProfit1(){
        String a = "100";
        String b = "110010";
        String actual = Main.Solution.addBinary(a, b);
        String expected = "110110";
        assertEquals(expected, actual);
    }

    public void testProfit2(){
        String a = "11";
        String b = "1";
        String actual = Main.Solution.addBinary(a, b);
        String expected = "100";
        assertEquals(expected, actual);
    }
}
