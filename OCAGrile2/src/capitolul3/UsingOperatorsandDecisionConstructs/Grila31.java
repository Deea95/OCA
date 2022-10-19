package capitolul3.UsingOperatorsandDecisionConstructs;

public class Grila31 {
    public static void main(String[] args) {
        String bob = new String("bob");
        String notBob = bob;
        System.out.println((bob == notBob) + " "+ (bob.equals(notBob)));
    }
}
