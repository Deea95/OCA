package capitolul3.UsingOperatorsandDecisionConstructs;

public class Grila41 {
    public static void main(String[] args) {
        System.out.println(getResult(5) + getResult(1)
                            +getResult(0) + getResult(2) + " ");

    }
    public static int getResult(int threshold){
        return threshold > 5 ? 1 :0;
    }
}
