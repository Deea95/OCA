package capitolul3.UsingOperatorsandDecisionConstructs;

public class Grila46 {
    public static void main(String... weather) {
        System.out.print(weather[0] !=null
                && weather[0].equals("sunny")
                && !false
                ? "Go Outside" : "Stay Inside");

    }
}
