import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] expenses = new int[30];
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(100_000) + 100_000;
        }
        return expenses;
    }

    public Main() {
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] expenses = generateRandomArray();
        int newSum = 0;
        for (int i = 0; i < expenses.length; i++) {
            newSum += expenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + newSum + " рублей");// тут просто в диапазоне грубо говоря суммирует ячейки верно? то есть он рендомно сумирует все траты за месяц в заданном вышедиапазоне? в первой задаче у тебя отборажалось много значений, я ошибся?
    }
        public static void task2() {
        System.out.println("Задача 2");
        int[] expenses = generateRandomArray();
        int min = 0;
        int max = 0;

        if (expenses.length > 0) {
            min = expenses[0];
            max = expenses[0];

            for (int i = 0; i < expenses.length; i++) { // тут мы инициализировали переменную ноль, что бы отработался цикл иначе 2 понятно что больше 1 к примеру, потом мы положили их в нувой начальный массив (индекс),
                // далее задали диапазон роста, ну а потом условие если индекс из диапозона массива меньше искомого наше искомое и есть этот индекс? в голове сложно на самом деле уложить, как он это считает автоматом
                if (expenses[i] < min) {
                    min = expenses[i];
                } else if (expenses[i] > max) {
                    max = expenses[i];
                }
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] expenses = generateRandomArray();// почему в этой задаче у тебя работал цикл без инициализации рандомного массива? тут мы к переменной прибавляли значение индекса массива потом делили на количество массива верно?
        int sumAll = 0;
        for (int i = 0; i < expenses.length; i++) {
            sumAll += expenses[i];
        }
        float average = (float) sumAll / expenses.length;
        System.out.println("Среднее за месяц %.2f \n" + average);
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}