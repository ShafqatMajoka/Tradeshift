import com.sun.deploy.security.ruleset.ExceptionRule;

/*
 * Matcher class is core class used to find the type of triangle.
 * Matcher class method (getTriangleType) takes the triangle's three sides as input and return
 * the type of triangle. The getTriangleType method will throw exception if any of the length is <= 0.
 *
 */
public class Matcher {
    // lenghtA, lenghtB and lenghtC are length of sides of triangle
    public TriangleType getTriangleType(int lenghtA, int lenghtB, int lenghtC)
    {
        if(lenghtA <=0) throw new IllegalArgumentException("Please enter the postive interger for lengthA");
        if(lenghtB <=0) throw new IllegalArgumentException("Please enter the postive interger for lengthB");
        if(lenghtC <=0) throw new IllegalArgumentException("Please enter the postive interger for lengthC");
        //if all sides are equal it is equilateral
        if(lenghtA==lenghtB && lenghtB==lenghtC)
        {
            return TriangleType.EQUILATERAL;
        }
        // if any of two sides are equal it is isosceles
        else if(lenghtA==lenghtB || lenghtB==lenghtC || lenghtA==lenghtC)
        {
            return TriangleType.ISOSCELES;
        }
        // if no side is equal to any other then it is scalene
        return TriangleType.SCALENE;
    }
}
