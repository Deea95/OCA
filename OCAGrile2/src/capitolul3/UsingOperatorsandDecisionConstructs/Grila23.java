package capitolul3.UsingOperatorsandDecisionConstructs;

public class Grila23 {
    public static void main(String[] args) {
        int flavors = 30;
        int eaten =0;
        switch(flavors) {
            case 30: eaten++;
            case 40: eaten+=2;
            default: eaten--;
        }
        System.out.println(eaten);
    }
}
