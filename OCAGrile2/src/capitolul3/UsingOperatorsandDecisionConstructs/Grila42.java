package capitolul3.UsingOperatorsandDecisionConstructs;

public class Grila42 {
    public String runTest(boolean spinner, boolean roller){
        if (spinner = roller) return "up";
        else return roller ? "down" : "middle";
    }

    public static final void main(String[] args) {
        final Grila42 tester = new Grila42();
        System.out.println(tester.runTest(false,true));
    }
}
