package capitolul3.UsingOperatorsandDecisionConstructs;

public class Grila9 {
    public void calculateResult (Integer candidateA, Integer candidateB){
        boolean process = candidateA == null || candidateA.intValue() <10;
       // boolean value = candidateA && candidateB;
    //    System.out.print(process || value);
    }

    public static void main(String[] args) {
        new Grila9().calculateResult(null,203);
    }
}
