public class LukeNumeric {
    private int N; // кількість перших чисел Люка

    public LukeNumeric(int N) {
        this.N = N;
    }

    public void findLukeNumeric() {
        int current = 1;
        int previous = 2;
        System.out.println(current + " є квадратом"); //завжди виводимо 1, бо це число є квадратом
        for (int i = 1; i < N; i++) {
            int temp = current; //зберігаємо значення поточного числа
            current = current + previous; //знаходимо наступне число, додавши два попередніх
            previous = temp; //число, що було поточним, стає попереднім
            if ((Math.sqrt(current)) % 1 == 0) { // якщо корінь числа Люка - ціле число
                System.out.println(current + " є квадратом");
            }
        }
    }
}
