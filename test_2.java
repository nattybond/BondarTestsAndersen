package testsAndersen;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class test_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String name2 = "Вячеслав";
        if (name.equals(name2))
            System.out.println("Привет, Вячеслав");
        else
            System.out.println("Нет такого имени");
    }
}
