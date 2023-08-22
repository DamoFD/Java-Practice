public class UnitTestForCircle
{
    public static void main(String[] args)
    {
        testGetArea(new Circle(10), 314.15926); // Supply the correct answers
        testGetArea(new Circle(0), 0.0);
    }

    public static void testGetArea(Circle c, double correctAnswer)
    {
        // use a tolerance to determine closeness of answer
        double tolerance = 0.0001;

        if (Math.abs(c.getArea() - correctAnswer) <= tolerance)
        {
            System.out.println(c.getRadius() + " passed the test");
        }
        else
        {
            System.out.println(c.getRadius() + " failed the test");
        }
    }
} // End of Circle class
