package capitolul3.UsingOperatorsandDecisionConstructs;

public class Grila40 {
    public static void main(String[] args) {
        int turtle = 10*(2+ (3+2)/5);
        int hare = turtle <5? 10:25;
        System.out.println(turtle < hare ? "Hare wins!" : "Turtle wins!");
    }
}
