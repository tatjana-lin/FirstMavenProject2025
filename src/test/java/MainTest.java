import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void testIsStringEmpty_Null() {
        Assert.assertTrue(Main.isStringEmpty(null), "Expected null to be empty");
    }

    @Test
    public void testIsStringEmpty_EmptyString() {
        Assert.assertTrue(Main.isStringEmpty(""), "Expected empty string to be empty");
    }

    @Test
    public void testIsStringEmpty_NonEmptyString() {
        Assert.assertFalse(Main.isStringEmpty("hello"), "Expected 'hello' to be non-empty");
    }

//    =====================================

    @Test
    public void testCountMatches_RegularCase(){
        Assert.assertEquals(Main.countMatches("Hello world", 'l'), 3);
    }

    @Test
    public void testCountMatches_NoMatches(){
        Assert.assertEquals(Main.countMatches("Hello world", '1'), 0);
    }

    @Test
    public void testCountMatches_EmptyString(){
        Assert.assertEquals(Main.countMatches("", 'l'), 0);
    }

    @Test
    public void testCountMatches_CaseSensitive(){
        Assert.assertEquals(Main.countMatches("Hello world", 'L'), 0);
    }

    @Test
    public void testCountMatches_AllSameCharacters(){
        Assert.assertEquals(Main.countMatches("LLLLLLL", 'L'), 7);
    }

    @Test
    public void testCountMatches_Symbols(){
        Assert.assertEquals(Main.countMatches("!@#$%", '!'), 1);
    }

    @Test
    public void testCountMatches_Numbers(){
        Assert.assertEquals(Main.countMatches("12345", '1'), 1);
    }

    @Test
    public void testCountMatches_Null(){
        Assert.assertEquals(Main.countMatches(null, '1'), 0);
    }

    //    =====================================

    @Test
    public void testReverse_RegularCase(){
        Assert.assertEquals(Main.reverse("abc"), "cba");
    }

    @Test
    public void testReverse_OneSymbol(){
        Assert.assertEquals(Main.reverse("a"), "a");
    }

    @Test
    public void testReverse_EmptyString(){
        Assert.assertEquals(Main.reverse(""), "");
    }

    @Test
    public void testReverse_OnlySpaces(){
        Assert.assertEquals(Main.reverse("  "), "  ");
    }

    @Test
    public void testReverse_Null(){
        Assert.assertNull(Main.reverse(null));
    }

    @Test
    public void testReverse_CaseSensitive(){
        Assert.assertEquals(Main.reverse("ABC"), "CBA");
    }

    @Test
    public void testReverse_Symbols(){
        Assert.assertEquals(Main.reverse("!@#$%"), "%$#@!");
    }

    @Test
    public void testReverse_Numbers(){
        Assert.assertEquals(Main.reverse("12345"), "54321");
    }

}
