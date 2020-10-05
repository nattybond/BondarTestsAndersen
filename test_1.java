package testsAndersen;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int inputnumber = Integer.parseInt(number);
        if (inputnumber > 7)
            System.out.println("Привет");
    }
}
