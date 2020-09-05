package First;

import java.util.Scanner;
public class First_class {



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int sum = 0;
            int array[] = new int[] {1,2,3,4,5};

            /////Task 1////
            for(int i = 0;i <= array.length;i++){
                sum += i;
            }
            System.out.println(sum);
            System.out.println("//////////");
            ///////////////
            /////Task 2////

            System.out.println("type in the size of the array");

            int size = 0;
            size = scan.nextInt();
            int array_2[] = new int[size];
            System.out.println("input in an array");

            for(int i = 0;i < size;i++){

                array_2[i] = scan.nextInt();
            }
            for(int i = 0;i < size;i++){
                System.out.print(array_2[i] + " ");
            }
            System.out.println("//////////");
            /////////Task 3////////

            
            System.out.println("//////////");
        }

}
