import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введіть номер числа Люка");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        LukeNumeric lukeNumeric = new LukeNumeric(N);
        lukeNumeric.findLukeNumeric();
    }
}
