public class Tradeshift {
    public static void main(String[] args)
    {
        Matcher matcher=new Matcher();
        System.out.println("Triangle Type is :"+ matcher.getTriangleType(5,5,5));
        System.out.println("Triangle Type is :"+ matcher.getTriangleType(4,5,4));
        System.out.println("Triangle Type is :"+ matcher.getTriangleType(4,5,6));
    }
}
