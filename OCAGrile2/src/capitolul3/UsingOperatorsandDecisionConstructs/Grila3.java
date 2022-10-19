package capitolul3.UsingOperatorsandDecisionConstructs;

public class Grila3 {
    public static void main(String... data) {
        String john = "john";
        String jon = new String(john);
        System.out.println((john == jon) + " " + (john.equals(jon)));
    }
}
