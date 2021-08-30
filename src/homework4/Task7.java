package homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int numberX = Integer.parseInt(number);

        int result;
        for (int i = 1; i <= 10; i++) {
            result = numberX*i;
            System.out.println(numberX+" * "+i+" = "+result);

        }

    }

}
