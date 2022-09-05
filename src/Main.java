import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int calcTriangleNumber(int number) {
        int result = 0;
        if (number == 0) return result;
        result = number + calcTriangleNumber(number - 1);
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите число для расчета треугольного числа: ");
        int number = Integer.parseInt(reader.readLine());

        System.out.println();
        System.out.printf("Треугольное число для числа %d равно %d", number, calcTriangleNumber(number));
    }
}
