import java.math.BigDecimal;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Block_2 {
    public static void main(String[] args) {
        System.out.println("Первое задание: \t" + repeat("hello", 3));
        System.out.println("Второе задание: \t" + differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println("Третье задание: \t" + isAvgWhole(new int[]{1, 2, 3, 4}));
        System.out.println("Четвёртое задание:\t" + Arrays.toString(cumulativeSum(new int[]{1, 2, 3})));
        System.out.println("Пятое задание:  \t" + getDecimalPlaces("44.00"));
        System.out.println("Шестое задание: \t" + Fibonacci(12));
        System.out.println("Седьмое задание:\t" + isValid("10000"));
        System.out.println("Восьмое задание:\t" + isStrangePair("ratio", "orator"));
        System.out.println("Девятое задание 1:\t" + isPrefix("automaton", "Auto-"));
        System.out.println("Девятое задание 2:\t" + isSuffix("Automaton", "-ton"));
        System.out.println("Десятое задание:\t" + boxSeq(6));
    }

    /**
      Первое задание.
      Повторяет каждый символ в строке str n-раз.
     */
    public static String repeat(String str, int n) {
        StringBuilder newStr = new StringBuilder();
        for (char i : str.toCharArray()) {
            newStr.append(String.valueOf(i).repeat(n));
        }
        return newStr.toString();
    }

    /**
      Второе задание.
      Вычисляет разницу между min и max в массиве.
     */
    public static int differenceMaxMin(int[] arr) {
        int Max = arr[0];
        int Min = arr[0];
        for (int i : arr) {
            if (Max < i) Max = i;
            if (Min > i) Min = i;
        }
        return Max - Min;
    }

    /**
      Третье задание.
      Вычисляет, являеться ли среднее арифметическое всех элементов массива целым.
     */
    public static boolean isAvgWhole(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum % arr.length == 0;
    }

    /**
      Четвёртое задание.
      Создаёт новый массив на основе введённго. Каждый элемент - сумма предидущих и его самого из начального массива.
     */
    public static int[] cumulativeSum(int[] arr) {
        int[] newArr = arr.clone();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                newArr[i] += arr[j];
            }
        }
        return newArr;
    }

    /**
      Пятое задание.
      Выводит количество символов после точки.
     */
    public static int getDecimalPlaces(String number) {
        return new BigDecimal(number).scale();

        /*
        int pointIndex = number.indexOf('.');
        int lastIndex = number.length() - 1;
        if (pointIndex == -1) pointIndex = lastIndex;
        return lastIndex - pointIndex;
        */

    }

    /**
      Шестое задание.
      Выводит n число в последовательности Фибоначчи.
     */
    public static int Fibonacci(int n) {
        if (n <= 1)
            return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    /**
      Седьмое задание.
      Вычисляет, является ли введённый текст почтовым индексом.  (5 цифр подряд)
     */
    public static boolean isValid(String postCode) {
        if (postCode.length() != 5) return false;
        for (int i = 0; i < 5; i++){
            if (!Character.isDigit(postCode.charAt(i))) return false; //если не является цифрой
        }
        return true;

    }

    /**
     Восьмое задание.
     Вычисляет, совподают ли символы строк (первый первой строки и последний второй строки и наоборот).
     */
    public static boolean isStrangePair(String str1, String str2) {
        return str1.charAt(0) == str2.charAt(str2.length() - 1) && str1.charAt(str1.length() - 1) == str2.charAt(0);
    }

    /**
     * Девятое задание 1.
     * Проверяет префикс в word.
     */
    public static boolean isPrefix(String word, String prefix) {
        prefix = prefix.replaceAll("-", "");
        return word.toLowerCase().startsWith(prefix.toLowerCase());
    }

    /**
     * Девятое задание 2.
     * Проверяет окончание в word.
     */
    public static boolean isSuffix(String word, String suffix) {
        suffix = suffix.replaceAll("-", "");
        return word.toLowerCase().endsWith(suffix.toLowerCase());
    }

    /**
     * Десятое задание.
     * Вычисляет количество клеток на поле на шаге step.
     */
    public static int boxSeq(int step) {
        int n = 0;
        for (int i = 0; i < step; i++) {
            if (i % 2 == 1) n += 3;
            else n -= 1;
        }
        return n;
    }
}