import org.junit.Assert;
import org.junit.Test;
public class MatcherTests {
    private Matcher matcher = new Matcher();
    /*
     * Unit test to test the method getTriangleType for Equilateral type
     * Unit test will pass if the method return Equilateral otherwise it will fail.
     */
    @Test
    public void Equilateral () throws Exception{
        Assert.assertEquals(TriangleType.EQUILATERAL,matcher.getTriangleType(1,1,1));
    }
    /*
    * Unit test to test the method getTriangleType for Isosceles type
    * Unit test will pass if the method return ISOSCELES otherwise it will fail.

    */
    @Test
    public void Isosceles () throws Exception{
        Assert.assertEquals(TriangleType.ISOSCELES,matcher.getTriangleType(1,2,1));
    }
    /*
     * Unit test to test the method getTriangleType for Scalene type
     * Unit test will pass if the method return Scalene otherwise it will fail.

    */
    @Test
    public void Scalene () throws Exception{
        Assert.assertEquals(TriangleType.SCALENE,matcher.getTriangleType(1,2,3));
    }
}
