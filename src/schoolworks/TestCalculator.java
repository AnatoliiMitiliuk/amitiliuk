package schoolworks;

public class TestCalculator {
    public static void main(String[] args) {
        testCalculator();
    }

    static void testCalculator() {


        // given data
        String[] givenArr = new String[]{"15 + 8", "100 - 25", "15 * 5", "1 / 4"};

        // expected results
        double[] expectedRes = new double[]{23, 75, 75, 0.25d};

        // actual results
        double[] actualRes = new double[expectedRes.length];
        for (int i = 0; i < expectedRes.length; i++) {
            actualRes[i] = Calculator.calculator(givenArr[i]);
        }

        // assert expected results equals actual resultss
        for (int i = 0; i < expectedRes.length; i++) {
            if (actualRes[i] != expectedRes[i]){
                throw new RuntimeException("TRST FAILED on element with index " +i);
            }

        }
        System.out.println("TEST SUCCESS");

    }


}


