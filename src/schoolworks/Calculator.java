package schoolworks;

public class Calculator {
    static double calculator (String str){
        String[] arr = str.split(" ");
        double result = 0;
        switch (arr[1]) {
            case "+":
                result = Double.parseDouble(arr[0]) + Double.parseDouble(arr[2]);
                break;
            case "-":
                result = Double.parseDouble(arr[0]) - Double.parseDouble(arr[2]);
                break;
            case "*":
                result = Double.parseDouble(arr[0]) * Double.parseDouble(arr[2]);
                break;
            case "/":
                result = Double.parseDouble(arr[0]) / Double.parseDouble(arr[2]);
                break;

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(calculator("4 * 4"));
    }
}
