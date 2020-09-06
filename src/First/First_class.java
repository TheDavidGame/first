package First;

import java.util.Scanner;
public class First_class {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int array[] = new int[]{1, 2, 3, 4, 5};

        /////Task 1////
        for (int i = 0; i <= array.length; i++) {
            sum += i;
        }
        System.out.print(sum);
        System.out.println(" ");
        System.out.print("//////////");

        ///////////////
        /////Task 2////
        System.out.println();
        for (String out1 : args) {
            System.out.println(out1);
        }
        /////////Task 3////////
        for (float i = 1; i < 10; i++) {
            float a = 1 / i;
            String formattedDouble = String.format("%.2f", a);

            System.out.print(formattedDouble + " ");
        }
        System.out.println(" ");
        System.out.println("//////////");
        /////////Task 4////////
        final int N = 10;
        int[] array_2 = new int[N];
        for (int i = 0; i < 10; i++) {
            array_2[i] = returnRandInt(100);


        }
        System.out.print("array: ");
        output(array_2);
        System.out.print("sorted array: ");

        Sort(array_2);
        System.out.println("//////////");
        /////////Task 5////////
    }

    public static int returnRandInt(int scale) {
        return (int) (Math.random() * scale);
    }

    public static void output(int numbs[]) {
        for (int i = 0; i < numbs.length; i++) {
            System.out.print(numbs[i] + " ");
        }
        System.out.println(" ");

    }
    public static void Sort(int array[]){
        for (int left = 0; left < array.length; left++) {
            // Вытаскиваем значение элемента
            int value = array[left];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
        output(array);
    }
}

