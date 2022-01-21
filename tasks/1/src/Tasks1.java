public class Tasks1 {

    /**
     * Находит остатка от деления.
     */
    public static int remainder(int dividend, int divisor) {
        return dividend % divisor;
    }

    /**
     * Находит площадь треугольника по основанию и высоте
     */
    public static int triArea(int a, int h) {
        return a * h / 2;
    }

    /**
     * Считает ноги всех животных.
     */
    public static int animals(int chickens, int cows, int pigs) {
        return chickens * 2 + cows * 4 + pigs * 4;
    }

    /**
     */
    public static boolean profitableGamble(double prob, double prize, double pay) {
        return prob * prize > pay;
    }

    /**
     * Выводит название операции, которое надо применить к a, b, чтобы получить N.
     */
    public static String operation(int n, int a, int b) {
        if (n == a + b) {
            return "added";
        } else if (n == a - b || n == b - a) {
            return "subtracted";
        } else if (n == a * b) {
            return "multiplied";
        } else if (n == a / b || n == b / a) {
            return "divided";
        }
        return "none";
        //switch (n) {
        //    case (a + b): return "added";
        //    case (a - b): return "subtracted";
        //    case (a * b): return "multiplied";
        //    case (a / b): return "divided";
        //}
        //return "none";
    }

    /**
     * Возвращает значение ASCII переданного символа.
     */
    public static int ctoa(char character) {
        return (int) character;
    }

    /**
     * Возвращает сумму чисел от 1 до n.
     */
    public static int addUpTo(int n) {
        return (1 + n) * n / 2;
    }

    /**
     * Находит максимальное целое значение третьего ребра треугольника.
     */
    public static int nextEdge(int a, int b) {
        return a + b - 1;
    }

    /**
     * Принимает массив чисел и возвращает сумму его кубов.
     */
    public static int sumOfCubes(int[] arrayOfNumbers) {
        int sum = 0;
        for (int element : arrayOfNumbers) {
            sum += element * element * element;
        }
        return sum;
    }

    /**
     */
    public static boolean abcMath(int a, int b, int c) {
        int finalValue = (int) (Math.pow(2, b) * a);
        return finalValue % c == 0;
    }

    public String toString() {
        String output =
                "Задачи по первому блоку:" +
                        "\nПервая задача: " + Tasks1.remainder(5, 5) +
                        "\nВторая задача: " + Tasks1.triArea(10, 10) +
                        "\nТретья задача: " + animals(5, 2, 8) +
                        "\nЧетвертая задача: " + profitableGamble(0.9, 1, 2) +
                        "\nПятая задача: " + operation(15, 11, 11) +
                        "\nШестая задача: " + ctoa('[') +
                        "\nСедьмая задача: " + addUpTo(7) +
                        "\nВосьмая задача: " + nextEdge(5, 7) +
                        "\nДевятая задача: " + sumOfCubes(new int[]{1, 5, 9}) +
                        "\nДесятая задача: " + abcMath(1, 2, 3);

        return output;
    }
}
